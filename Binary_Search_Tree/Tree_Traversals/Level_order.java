import java.util.*;
public class Level_order{
	static Node root;
	static void insert(int value){
		insertNode(root,value);
	}
	static Node insertNode(Node root, int value){
		if(root==null){
			root=new Node(value);
			return root;
		}
		if(root.value>value){
			root.left=insertNode(root.left,value);
		}
		else if(root.value<value){
			root.right=insertNode(root.right,value);			
		}
		return root;
	}
	
	static void level_order(Node root){
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			Node temporary_root=q.poll();
			System.out.print(temporary_root.value+"	");
			if(temporary_root.left!=null)
				q.add(temporary_root.left);
			if(temporary_root.right!=null)
				q.add(temporary_root.right);
		}
	}
	
	public static void main(String[] args){
		root=new Node(22);
		insert(20);insert(25);insert(23);
		insert(24);insert(19);insert(21);
		level_order(root);
	}
}
class Node{
	int value;
	Node left,right;
	Node(int value){
		this.value=value;
		left=null;
		right=null;
	}
}