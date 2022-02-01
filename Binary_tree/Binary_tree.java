public class Binary_tree{
	TreeNode root;
	public void Inorder(TreeNode root){
		if(root!=null){
			Inorder(root.left);
			System.out.print(root.key+"-->");
			Inorder(root.right);
		}
	}
	
	public void Preorder(TreeNode root){
		if(root!=null){
			System.out.print(root.key+"-->");
			Preorder(root.left);
			Preorder(root.right);
		}
	}

	public void Postorder(TreeNode root){
		if(root!=null){
			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.key+"-->");
		}
	}
	
	public static void main(String[] args){
		Binary_tree tree=new Binary_tree();
		tree.root=new TreeNode(1);
		tree.root.left=new TreeNode(2);
		tree.root.right=new TreeNode(3);
		tree.root.left.left=new TreeNode(4);
		tree.root.left.right=new TreeNode(5);
		tree.root.left.right.left=new TreeNode(6);
		tree.root.left.right.right=new TreeNode(7);
		tree.root.left.right.right.left=new TreeNode(8);
		tree.Preorder(tree.root);
	}
}

