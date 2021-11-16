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

    public void push(int data){
        ListNode temp=new ListNode(data);

    }
}