// list is sorted :)
import java.util.*;
public class Remove_duplicates{
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
	
	static void remove_duplicates(){
			Node temp=head;
			while(temp!=null){
				if(temp.next==null)
					break;
				if(temp.data==temp.next.data){
					temp.next=temp.next.next;
				}
				temp=temp.next;
			}
		}
	
	
	static void traverse(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+"	");
			current=current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		for(int i=1;i<17;i++){
			addNode(i);
			if(i%2==0)
				addNode(i);
		}
		System.out.println("before removing duplicates Linked List");
		traverse();
		System.out.println("After removing duplicates Linked List");
		remove_duplicates();
		traverse();
	}
}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}