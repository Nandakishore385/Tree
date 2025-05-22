// InOrder tree
public class Tree {
    public static void main(String[] args) {
      Node root = new Node(12);
      root.left = new Node(11);
      root.right = new Node(13);
      root.left.left = new Node(5);
      root.left.right = new Node(6);
       
      root.inOrder(root);
       
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
  void inOrder(Node root){
    if(root==null){
      return;
    }
    // left // root // right
    inOrder(root.left);
    System.out.println(root.data);
    inOrder(root.right);
  }
}



