import java.util.*;
public class insert_in_sorted_List{
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

    static void insert(int value){
        Node node=new Node(value);
        Node current=head;
        if(head.data>=value){
            node.next=head;
            head=node;
            return;
        }
        while(current.next!=null && current.next.data<value){
            current=current.next;
        }
        node.next=current.next;
        current.next=node;
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
		insert(0);
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

