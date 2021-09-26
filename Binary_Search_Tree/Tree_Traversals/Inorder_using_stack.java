import java.util.*;
public class Inorder_using_stack{
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
	static void InorderTraversal(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack=new Stack<>();
        Node temporary_node=root;
        while(!stack.isEmpty() || temporary_node!=null){
            while(temporary_node!=null){
                stack.push(temporary_node);
                temporary_node=temporary_node.left;
            }
            temporary_node=stack.pop();
            System.out.print(temporary_node.value+" -> ");
            temporary_node=temporary_node.right;
        }
    }
	public static void main(String[] args){
		root=new Node(10);
		insert(11);insert(56);insert(44);insert(12);insert(45);insert(32);insert(41);insert(23);
		insert(9);insert(51);insert(35);insert(21);insert(78);insert(81);insert(75);insert(33);
		InorderTraversal(root);
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