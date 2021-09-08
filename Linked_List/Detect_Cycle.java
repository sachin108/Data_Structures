//it will change data of list
import java.util.*;
public class Detect_Cycle{
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
	static void detectCycle(Node head){
		boolean cycleExists=false;
		int cycle_poition=-1;
		Node temporary_Node=head;
		while(temporary_Node!=null){
			if(temporary_Node.data==Integer.MIN_VALUE){
				cycleExists=true;
				break;
			}
			temporary_Node.data=Integer.MIN_VALUE;
			temporary_Node=temporary_Node.next;
			++cycle_poition;
		}
		if(cycleExists)
			System.out.println("YES, cycle exists");
	}

	public static void main(String[] args){
		for(int i=0;i<10;i++){
			addNode(i);
		}
		tail.next=head.next.next;// added a cycle
		detectCycle(head);
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
