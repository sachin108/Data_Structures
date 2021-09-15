import java.util.*;
public class Insertion{
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
		int level=1;
		while(printLevel(root,level))
			++level;
	}
	static boolean printLevel(Node root, int level){
		if(root==null)
			return false;
		if(level==1){
			System.out.print(root.value+"	");
			return true;
		}
		boolean left=printLevel(root.left,level-1);
		boolean right=printLevel(root.right,level-1);
		return left||right;
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