import java.util.*;
public class Swap_Adjacents{
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
	static void swapping(){
		Node temporary_node=head;
		int x=0;
		while(temporary_node!=null && temporary_node.next!=null){
			x=temporary_node.data;
			temporary_node.data=temporary_node.next.data;
			temporary_node.next.data=x;
			temporary_node=temporary_node.next.next;
		}
		traverse(head);
	}
	static void traverse(Node head){
		Node temp=head;
		System.out.println();
		while(temp!=null){
			System.out.print(temp.data+"	");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			addNode(i);
		}
		System.out.println("before swapping");
		traverse(head);
		System.out.println("after swapping");
		swapping();
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}