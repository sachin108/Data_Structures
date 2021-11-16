import java.util.EmptyStackException;

public class StackX{
    private ListNode top;
    private int length;
    
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data; // can be a generic type
            this.next=null; // reference to next ListNode in List(Stack)
        }
    }

    public StackX(){
        top=null;
        length=0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void push(int data){
        ListNode temp=new ListNode(data);
        temp.next=top;
        top=temp;
        ++length;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();
        int result=top.data;
        top=top.next;
        --length;
        return result;
    }

    public static void main(String[] args) {
        StackX stack=new StackX();
        for (int i = 0; i < 7; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
    }
}