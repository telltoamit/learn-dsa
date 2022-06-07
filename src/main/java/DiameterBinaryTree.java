public class DiameterBinaryTree {

    static int ans =0;
   public static void main(String args[]){
      /*
                2
            3       4
          5   6   7    8
        9
       10
       
      */
      LeftViewNode root  = new LeftViewNode(2);
      root.left = new LeftViewNode(3);
      root.right = new LeftViewNode(4);
      root.left.left = new LeftViewNode(5);
      root.left.right = new LeftViewNode(6);
      root.right.left = new LeftViewNode(7);
      root.right.right = new LeftViewNode(8);
      root.left.left.left = new LeftViewNode(9);
      root.left.left.left.left = new LeftViewNode(10);
      System.out.println(findDiameter(root));
    }
   public static int findDiameter(LeftViewNode root) {
//          if(root ==  null) return 0;
//           int dLeft = findDiameter(root.left);
//           int dRight = findDiameter(root.right);
//           int lHeight = height(root.left);
//           int rHeight = height(root.right);
//          return Math.max(Math.max(dLeft,dRight), 1+ lHeight+rHeight);
           height(root);
           return ans;
   }
   private static int  height(LeftViewNode root) {
       if(root ==  null ) return 0;
       int lHeight = height(root.left);
       int rHeight = height(root.right);
       ans = Math.max(ans,1+ lHeight+rHeight);
       return Math.max(1+lHeight,1+rHeight);
   }
}
class Node {
  LeftViewNode left;
  LeftViewNode right;
  int data;

  Node(int data){
    this.data = data;
    left=right=null;
  }
}
