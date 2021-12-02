public class Binary_tree{
	Node root;
	public void Inorder(Node root){
		if(root!=null){
			Inorder(root.left);
			System.out.print(root.key+"-->");
			Inorder(root.right);
		}
	}
	
	public void Preorder(Node root){
		if(root!=null){
			System.out.print(root.key+"-->");
			Preorder(root.left);
			Preorder(root.right);
		}
	}

	public void Postorder(Node root){
		if(root!=null){
			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.key+"-->");
		}
	}
	
	public static void main(String[] args){
		Binary_tree tree=new Binary_tree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.left.right.left=new Node(6);
		tree.root.left.right.right=new Node(7);
		tree.root.left.right.right.left=new Node(8);
		tree.Preorder(tree.root);
	}
}

class Node{
	Node left, right;
	int key;
	Node(int key){
		this.key=key;
		left=right=null;
	}
}