import java.util.*;
public class remove_Cycle{
	
	static Node head,tail;
	
	static void addNode(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=newNode;
		}
		tail.next=null;
	}
	
	static void remove_loop(Node head){
		Node current=head;
		HashSet<Node> set_Of_Nodes=new HashSet<>();
		Node previous_node=null;
		while(true){
			if(set_Of_Nodes.contains(current)){
				previous_node.next=null;
				break;
			}
			set_Of_Nodes.add(current);
			previous_node=current;
			current=current.next;
		}
	}
	
	static void traverse(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"	");
			temp=temp.next;
		}
	}

	public static void main(String[] args){
		for(int i=0;i<10;i++){
			addNode(i);
		}
		tail.next=head.next.next;// added a cycle
		remove_loop(head);
		traverse(head);
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}