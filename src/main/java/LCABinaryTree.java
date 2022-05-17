public class LCABinaryTree {

    public static void main(String[] args) {
     /*
     *        2
     *      /  \
     *      3   4
     *     / \   \
     *    5   6    7
     *  /  \
     * 8    9
     *
     * */
        TreeNode root  = new TreeNode(2);
        root.left= new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        LCABinaryTree tree = new LCABinaryTree();
        assertThat(tree.lca(root, 8, 9) == 5);
        assertThat(tree.lca(root, 8, 7) == 2);
        assertThat(tree.lca(root, 80, 70) == -1);






    }
    private static void assertThat(boolean expression ) {
        if(!expression){
             throw  new RuntimeException("Failed for test Case");
        }else{
            System.out.println("Test Passed");

        }
    }

    public int lca(TreeNode root, int node1, int node2){

        if(root == null) return -1;
        if(root.data == node1 || root.data == node2) return root.data;
        int left = lca(root.left,node1,node2);
        int right = lca(root.right,node1,node2);
        if(left == -1) return right;
        if(right == -1) return left;
        return root.data;
    }
}

class Node {

    int data;
    TreeNode left;
    TreeNode right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }

}
