import java.util.*;
public class Middle_Node{
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
    
    static Node mid(){
        Node fast=head, slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
		for(int i=1;i<11;i++){
			addNode(i);
		}
		System.out.println("before deleting a node");
		traverse(head);
		System.out.println("after deleting a node");
        Node MiddleNode=mid();
        System.out.println("middle node's value = "+MiddleNode.data);
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}