import java.util.*;
public class Preorder_stack{
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
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp=stack.pop();
            System.out.print(temp.value+"-->");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            // because we have to traverse left before right so we push right before left
            if(temp.left!=null){
                stack.push(temp.left);
            }
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
