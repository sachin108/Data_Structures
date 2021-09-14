
import java.util.*;
public class Remove_Node_from_end{
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
	
	static void removeNode(int n){
		Node slow=head,fast=head;
		while(n>=0){
			fast=fast.next;
			--n;
		}
		while(fast!=null){
			slow=slow.next;
			fast=fast.next;
		}
		slow.next=slow.next.next;
		traverse(head);
	}
	
	static void traverse(Node x){
		Node current=x;
		while(current!=null){
			System.out.println(current.data+"	");
			current=current.next;
		}
	}
	
	public static void main(String[] args){
		for(int i=1;i<17;i++){
			addNode(i);
		}
		System.out.println("before removing  Node");
		traverse(head);
		System.out.println("After removing Node");
		removeNode(3);
		//traverse(head);
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}