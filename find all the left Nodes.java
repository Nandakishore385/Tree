// find all the left Nodes
public class Tree {
    public static void main(String[] args) {
      Node root = new Node(12);
      root.left = new Node(11);
      root.right = new Node(13);
      root.left.left = new Node(5);
      root.left.right = new Node(6);
      root.printLeafNode(root);
       
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
  void printLeafNode(Node root){
    if(root==null){
      return;
    }
    if(root.left==null && root.right==null){
      System.out.println(root.data);
    }
    printLeafNode(root.left);
    printLeafNode(root.right);
  }
  
}  
    
    