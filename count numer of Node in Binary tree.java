// count numer of Node in Binary tree
public class Tree {
    public static void main(String[] args) {
      Node root = new Node(12);
      root.left = new Node(11);
      root.right = new Node(13);
      root.left.left = new Node(5);
      root.left.right = new Node(6);
      System.out.println("No of Nodes are : "+ root.countNodes(root));
       
      // tree traversals
      // 3 ways for traversing
      // indorder(left,root,right)
      // pre order (root,left,right)
      // post order(left,right,root)
    
       
    }
     
}

class Node{
  int data;
  Node left;
  Node right;
  
  Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
  int countNodes(Node root){
    if(root==null){
      return 0;
    }
    return 1 + countNodes(root.left) + countNodes(root.right);
    
    
  }
  
}  