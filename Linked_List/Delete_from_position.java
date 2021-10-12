import java.util.*;
public class Delete_from_position{
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
    
    static void delete(int position){
        if(position==1){
            head=head.next;
            return;
        }
        Node temp=head;
        while(position>1){
            temp=temp.next;
            --position;
        }
        temp.next=temp.next.next;
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
		System.out.println("before deleting a node");
		traverse(head);
		System.out.println("after deleting a node");
        delete(3);
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