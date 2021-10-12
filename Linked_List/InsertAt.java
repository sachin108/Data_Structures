import java.util.*;
public class InsertAt{
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

    static void insertAt(int position, int value){
        Node temp=head;
        for(int i=1;i<position;i++){
            temp=temp.next;
        }
        Node x=temp.next;
        Node node=new Node(108);
        temp.next=node;
        node.next=x;
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
		System.out.println("before inserting between");
		traverse(head);
		System.out.println("after inserting a node at specific position");
		insertAt(3, 108);
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