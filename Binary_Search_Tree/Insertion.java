import java.util.*;
public class Insertion{
	TreeNode insert(TreeNode root, int value){
		if(root==null){
			root=new TreeNode(value);
			return root;
		}
		if(root.value>value){
			root.left=insert(root.left,value);
		}
		else if(root.value<value){
			root.right=insert(root.right,value);			
		}
		return root;
	}
	static void treeTraversal(TreeNode root){
		if(root!=null){
			treeTraversal(root.left);
			System.out.print(root.value+" -> ");
			treeTraversal(root.right);
		}
	}
	public static void main(String[] args){
		TreeNode root=new TreeNode(10);
		Insertion obj=new Insertion();
		Scanner in=new Scanner(System.in);
		int k;
		for(int i=0;i<6;i++){
			k=in.nextInt();
			obj.insert(root,k);
		}
		treeTraversal(root);
	}
}
