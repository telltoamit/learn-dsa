public class DiameterBinaryTree {
    
   public static void main(String args[]){
      /*
                2
            3       4
          5   6   7    8
        9
       10
       
      */
      Node root  = new Node(2);
      root.left = new Node(3);
      root.right = new Node(4);
      root.left.left = new Node(5);
      root.left.right = new Node(6);
      root.right.left = new Node(7);
      root.right.right = new Node(8);
      root.left.left.left = new Node(9);
      root.left.left.left.left = new Node(10);
      assert(findDiameter(root)==7);
    }
   public static findDiameter(Node root) {
          if(root ==  null) return 0;
           dLeft = findDiameter(root.left);
           dRight = findDiameter(root.right);
          return Math.max(dLeft,dRight, 1+ dLeft+dRight);
   }
}
class Node{
  Node left;
  Node right;
  int data;
  
  Node(int data){
    this.data = data;
    left=right=null;
  }
}
