public class LevelOrderTraversalBinaryTree{
  public static void main(String[] args) {
    Node root = new Node(2);
    root.left = new  Node(3);
    root.right = new Node(4);
    root.left.left = new Node(5);
    root.left.right = new Node(6);
    root.right.left = new Node(7);
    root.right.right = new Node(8);
    root.left.left.left = new Node(9);
    
    printLevelOrder(Node root);
    
  }
  private static void printLevelOrder(Node root) {
    for(int level =1;level<height(root);level++){
      printLevel(root,level);
    }
    
  }
  private static int height(Node root) {
     if(root ==null) return 0;
      return Math.max(height(root.left)+1, height(root.right)+1);
  }
  
  private static void printLevel(Node root, int level){
     if(root == null) return;
     if(level==1){
       System.out.print(root.data);
     }
    printLevel(root.left, level-1);
    printLevel(root.right,level-1);
  }
  
  
  
}
class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data = data;
    left = right = null;
  }
}
