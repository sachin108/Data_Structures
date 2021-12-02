import java.util.*;
public class Preorder {
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

    static void preorderTraversal(Node root){
        if(root!=null){
            System.out.print(root.value+"-->");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
    
	
	public static void main(String[] args){
		root=new Node(10);
		insert(11);insert(56);insert(44);insert(12);insert(45);insert(32);insert(41);insert(23);
		insert(9);insert(51);insert(35);insert(21);insert(78);insert(81);insert(75);insert(33);
		preorderTraversal(root);
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