import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversalBinaryTree{
  public static void main(String[] args) {
    LevelNode root = new LevelNode(2);
    root.left = new LevelNode(3);
    root.right = new LevelNode(4);
    root.left.left = new LevelNode(5);
    root.left.right = new LevelNode(6);
    root.right.left = new LevelNode(7);
    root.right.right = new LevelNode(8);
    root.left.left.left = new LevelNode(9);
    LevelNode test2 = new LevelNode(0);

    levelOrderQueue(root);
    
  }
  private static void printLevelOrder(LevelNode root) {
    for(int level =1;level<=height(root);level++){
      printLevel(root,level);
    }
    
  }
  private static int height(LevelNode root) {
     if(root ==null) return 0;
      return Math.max(height(root.left)+1, height(root.right)+1);
  }
  
  private static void printLevel(LevelNode root, int level){
     if(root == null) return;
     if(level==1){
       System.out.print(root.data);
     }
    printLevel(root.left, level-1);
    printLevel(root.right,level-1);
  }
  private static void levelOrderQueue(LevelNode root){
    Queue<LevelNode>  queue = new ArrayDeque<>();
    queue.add(root);

    while(!queue.isEmpty()){
      LevelNode top = queue.poll();
      System.out.print(top.data);
      if(top.left != null)
        queue.add(top.left);
      if(top.right != null)
        queue.add(top.right);
    }
  }
  
  
  
}
class LevelNode {
  int data;
  LevelNode left;
  LevelNode right;
  LevelNode(int data){
    this.data = data;
    left = right = null;
  }
}
