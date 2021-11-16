import java.util.*;
public class Number_of_nodes{
	static Node root;
    static int no_of_nodes;
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
	
    static int count_nodes(Node root){

    }
	
	public static void main(String[] args){
		root=new Node(22);
		insert(20);insert(25);insert(23);
		insert(24);insert(19);insert(21);
		count_nodes(root);
        System.out.print(no_of_nodes);
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