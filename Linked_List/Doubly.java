import java.util.Scanner;

public class Doubly{
	Node head,tail;;
	Scanner input = new Scanner(System.in);

	void AddNodeT(){
		System.out.println("enter data");
		Node newNode=new Node(input.nextInt());

		if(head==null){
			head=newNode;
			tail=newNode;
			head.prv=null;
			tail.next=null;
		}
		else{
			tail.next=newNode;
			newNode.prv=tail;
			tail=newNode;
			tail.next=null;
		}
	}

	void AddNodeH(){
		System.out.println("enter data");
		Node newNode=new Node(input.nextInt());
		if(head==null){
			head=tail=newNode;
			head.prv=null;
			tail.next=null;
		}
		else{
			head.prv=newNode;
			newNode.next=head;
			head=newNode;
		}
	}

	void AddNodeBw(){
		System.out.println("enter position");
		int pos=input.nextInt();

		Node newNode=new Node(input.nextInt());
		Node current=head;
		for (int i=1; i<pos; i++) {
			current=current.next;
		}
		newNode.next=current.next;		
		current.next=newNode;
		newNode.prv=current;
		newNode.next.prv=newNode;
	}

	void delNode(){
		System.out.println("enter position");
		int p=input.nextInt();

		Node temp=null;
		Node current=head;
		for(int i=1;i<p;i++){
			temp=current;
			current=current.next;
		}
		current.next.prv=temp;
		current=current.next;
		temp.next=current;
	}

	void traverse(){
		Node current=head;
		System.out.println("traversing\n");
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}

	public static void main(String[] args) {
		
		Doubly obj=new Doubly();
		for(int i=0;i<3;i++){
			obj.AddNodeT();
		}

		for(int i=0;i<3;i++){
			obj.AddNodeH();
		}
		System.out.println();
		obj.traverse();				
		obj.AddNodeBw();
		System.out.println();
		obj.traverse();	
		obj.delNode();	
		obj.traverse();	
	}
}

class Node{
	Node next;
	Node prv;
	int data;

	Node(){

	}

	Node(int data){
		this.data=data;
	}
}