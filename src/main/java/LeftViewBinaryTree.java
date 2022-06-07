import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class LeftViewBinaryTree{
  
  public static void main(String args[]){
     LeftViewNode root = new LeftViewNode(2);
     root.left = new LeftViewNode(3);
     root.right = new LeftViewNode(4);
     root.left.left = new LeftViewNode(5);
    root.left.right = new LeftViewNode(6);
    root.right.left = new LeftViewNode(7);
    root.right.right = new LeftViewNode(8);
    root.right.right.right = new LeftViewNode(9);
    LeftViewNode dummy = new LeftViewNode(-1);
    printLeftViewBinaryTree(root,dummy);
  
  }
  
  public static void printLeftViewBinaryTree(LeftViewNode root, LeftViewNode dummy) {
    ArrayList<LeftViewNode> list = new ArrayList<>();
    printLevel(root, 0, list);
    for (int level =0;level < list.size();level++)
        System.out.print(list.get(level).data);
    }
//    private static int getHeight (LeftViewNode root){
//      if (root == null) return 0;
//      return Math.max(getHeight(root.left) + 1, getHeight(root.right) + 1);
//    }
    private static void printLevel(LeftViewNode root,int level, ArrayList<LeftViewNode > list){

      if (root == null) return;
      if (list.get(level) == null) {
        list.set(level, root);
//        System.out.print(root.data);
      }
      printLevel(root.left, level + 1, list);
      printLevel(root.right, level + 1, list);
    }
  }

class LeftViewNode {
  int data;
  LeftViewNode left;
  LeftViewNode right;

  LeftViewNode(int data){
    this.data = data;
    left=right=null;
  }

}
