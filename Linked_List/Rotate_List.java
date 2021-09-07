
import java.util.*;
public class Rotate_List{
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
	
	static void rotate(int rotateBY){
		Node temporary_head=head;
		int length_of_LL=1;
		while(temporary_head.next!=null){
			++length_of_LL;
			temporary_head=temporary_head.next;
		}
		temporary_head.next=head;//last element of Linked List is pointing to head (previous)
		rotateBY=rotateBY%length_of_LL;
		rotateBY=length_of_LL-rotateBY;
		while(rotateBY>0){
			temporary_head=temporary_head.next;
			--rotateBY;
		}
		head=temporary_head.next;// new head
		temporary_head.next=null;// after above 2 operations list is circular so break the chain by assigning null
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
		System.out.println("After rotating Linked List");
		rotate(2);
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
