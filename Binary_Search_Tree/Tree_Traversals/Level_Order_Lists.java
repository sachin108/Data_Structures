import java.util.*;
public class Level_Order_Lists{
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
	
	static List<List<Integer>> level_order(Node root){
        List<List<Integer>> list=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!(q.isEmpty())){
            List<Integer> l=new ArrayList<>();
            for(int i=q.size(); i>0; --i){
                Node node=q.poll();
                l.add(node.value);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            list.add(l);
        }
        return list;
	}
	
	public static void main(String[] args){
		root=new Node(22);
		insert(20);insert(25);insert(23);
		insert(24);insert(19);insert(21);
		insert(12);insert(34);insert(15);
		insert(42);insert(16);insert(56);
		List<List<Integer>> l=level_order(root);
        for(List<Integer> i: l){
            for(int x: i){
                System.out.print(x+"  ");
            }
            System.out.println();
        }
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