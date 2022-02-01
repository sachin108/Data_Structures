public class SameBinaryTree {

    boolean sameTrees(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        return  (root1.key==root2.key) && sameTrees(root1.left, root2.left) && sameTrees(root1.right, root2.right);
     }
    public static void main(String[] args) {
        SameBinaryTree obj=new SameBinaryTree();    

        TreeNode root1=new TreeNode(0);
        root1.left=new TreeNode(1);
        root1.right=new TreeNode(2);        
        root1.left.left=new TreeNode(6);
        root1.left.right=new TreeNode(3);        
        root1.right.left=new TreeNode(7);
        root1.right.right=new TreeNode(4);        

        TreeNode root2=new TreeNode(0);
        root2.left=new TreeNode(1);
        root2.right=new TreeNode(2);        
        root2.left.left=new TreeNode(6);
        root2.left.right=new TreeNode(3);        
        root2.right.left=new TreeNode(7);
        root2.right.right=new TreeNode(4);
        
        System.out.print(obj.sameTrees(root1, root2));
    }    
}
