
import java.util.*;
public class Delete_Nodes{
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
	
	static void delete_head(){
		head=head.next;
	}
	
	static void delete_tail(){
		Node temp=head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next=null;
	}
	
	static void delete_random_node(Node to_be_deleted){
		Node temp=head;
		while(temp!=null){
			if(temp.next==to_be_deleted){
				temp.next=temp.next.next;
				break;
			}
			temp=temp.next;
		}
	}

	
	static void traverse(Node x){
		Node current=x;
		while(current!=null){
			System.out.println(current.data+"	");
			current=current.next;
		}
	}
	
	public static void main(String[] args){
		for(int i=1;i<11;i++){
			addNode(i);
		}
		System.out.println("before deleting nodes");
		traverse(head);
		System.out.println("After deleting head,tail and a random node of Linked List");
		delete_head();
		Node random_Node=head.next.next.next;
		delete_random_node(random_Node);
		delete_tail();
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