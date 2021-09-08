
import java.util.*;
public class Reverse_List{
	static Node head,tail;
	
	static void addNode(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=newNode;
		}
		tail.next=null;
	}
	
	static Node reverse(){
		Node previous_node=null,next_node;
		Node current_node=head;
		while(current_node!=null){
			next_node=current_node.next;
			current_node.next=previous_node;
			previous_node=current_node;
			current_node=next_node;
		}
		return previous_node;
	}
	
	static void traverse(Node x){
		Node current=x;
		while(current!=null){
			System.out.println(current.data+"	");
			current=current.next;
		}
	}
	
	public static void main(String[] args){
		for(int i=1;i<7;i++){
			addNode(i);
		}
		System.out.println("before rotating Linked List");
		traverse(head);
		System.out.println("After reversing Linked List");
		Node x=reverse();
		traverse(x);
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}