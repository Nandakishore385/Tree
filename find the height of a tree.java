// find the height of a tree
public class Tree {
    public static void main(String[] args) {
      Node root = new Node(12);
      root.left = new Node(11);
      root.right = new Node(13);
      root.left.left = new Node(5);
      root.left.right = new Node(6);
      System.out.println("Height of the tree is : "+ root.height(root));
       
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
  int height(Node root){
    if(root==null){
      return -1;
    }
    return 1 + Math.max(height(root.left),height(root.right));
  }
  
}