import java.util.*;
public class Intersection{
	
	void addNode(Node head,int data){
		Node newNode=new Node(data);
		if(head==null){
			head.next=newNode;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}			
			temp.next=newNode;
		}
		newNode.next=null;
	}
	
	Node intersection(Node a,Node b){
		Node List1=a,List2=b;
		Node head=new Node();
		while(List1!=null && List2!=null){
			if(List1.data==List2.data){
				addNode(head,List1.data);
				List1=List1.next;
				List2=List2.next;
				continue;
			}
			if(List1.data<List2.data){
				List1=List1.next;
			}else{
				List2=List2.next;
			}
		}
		return head;
	}
	
	void traverse(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"	");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args){
		Node head1=new Node();
		Node head2=new Node();
		Intersection obj1=new Intersection();
		for(int i=1;i<11;i++){
			obj1.addNode(head1,i);
		}

		obj1.addNode(head2,2);
		obj1.addNode(head2,4);
		obj1.addNode(head2,6);
		obj1.addNode(head2,7);
		obj1.addNode(head2,9);
		
		Node commonElements=obj1.intersection(head1,head2);
		commonElements=commonElements.next;
		obj1.traverse(commonElements);
	}
}
class Node{
	Node next;
	int data;
	Node(){
		
	}
	Node(int data){
		this.data=data;
	}
}