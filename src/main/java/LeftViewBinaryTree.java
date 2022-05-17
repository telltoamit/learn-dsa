public class LeftViewBinaryTree{
  
  public static void main(String args[]){
     Node root = new Node(2);
     root.left = new Node(3);
     root.right = new Node(4);
     root.left.left = new Node(5);
    root.left.right = new Node(6);
    root.right.left = new Node(7);
    root.right.right = new Node(8);
    root.right.right.right = new Node(9);
    Node dummy = null;
    printLeftViewBinaryTree(root,dummy);
  
  }
  
  public static void printLeftViewBinaryTree(Node root,dummy){
    Queue<Node> queue = new ArrayDeque<>();
    queue.add(root);//2
    queue.add(dummy);//null,2
    while(!queue.isEmpty()){ // true,true
      Node top = queue.poll(); //2 -> 3 >4 > 5
      if(queue.poll() == null) // true, true, false, true
        System.out.print(top.data);  //2, 3 > > 5
      if(top.left != null) // 3 != null,  5 != null > 7!= null
          queue.add(top.left);  // 5,4 > 7,6,null,5
          queue.add(dummy);     // 3, null -> null,5,4 > null, 7, 6, null, 5
      if(top.right != null)    // 4  != null > 6!= null > 8 != null
        queue.add(top.right);   //4,null,3 > 6,null,5,4 > 8, null, 7, 6, null, 5
    }
    
    
  
  }
}

Node {
  int data;
  Node left;
  Node right;
  
  Node(int data){
    this.data = data;
    left=right=null;
  }

}
