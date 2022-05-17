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
      TreeNode root  = new TreeNode(2);
      root.left = new TreeNode(3);
      root.right = new TreeNode(4);
      root.left.left = new TreeNode(5);
      root.left.right = new TreeNode(6);
      root.right.left = new TreeNode(7);
      root.right.right = new TreeNode(8);
      root.left.left.left = new TreeNode(9);
      root.left.left.left.left = new TreeNode(10);
      System.out.println(findDiameter(root));
    }
   public static int findDiameter(TreeNode root) {
//          if(root ==  null) return 0;
//           int dLeft = findDiameter(root.left);
//           int dRight = findDiameter(root.right);
//           int lHeight = height(root.left);
//           int rHeight = height(root.right);
//          return Math.max(Math.max(dLeft,dRight), 1+ lHeight+rHeight);
           height(root);
           return ans;
   }
   private static int  height(TreeNode root) {
       if(root ==  null ) return 0;
       int lHeight = height(root.left);
       int rHeight = height(root.right);
       ans = Math.max(ans,1+ lHeight+rHeight);
       return Math.max(1+lHeight,1+rHeight);
   }
}
class TreeNode {
  TreeNode left;
  TreeNode right;
  int data;

  TreeNode(int data){
    this.data = data;
    left=right=null;
  }
}
