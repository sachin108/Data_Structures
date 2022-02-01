public class DynamicArray{
    private int[] list;
    private int maxSize, currentSize;
    
    DynamicArray(){
        list=new int[1];
        maxSize=1;
        currentSize=0;
    }

    public void add(int key){
        if(currentSize==maxSize)
            growSize();
        list[currentSize]=key;
        ++currentSize;
    }

    public void growSize(){
        if(currentSize==maxSize){
            int temp[]=new int[maxSize*2];
            int i=0;
            for(int element:list){
                temp[i++]=element;
            }
            list=temp;
            maxSize=maxSize*2;
            return;
        }
        System.out.println("arary is not full so there is no need to grow size");
    }

    public void addAt(int index, int key){
        if(currentSize==maxSize)
            growSize();
        for(int i=currentSize-1; i>=index; --i)
            list[i+1]=list[i];
        list[index]=key;
        ++currentSize;
    }

    public void remove(){
        if(currentSize>0){
            list[currentSize-1]=0;
            --currentSize;
        }
    }

    public void removeFrom(int index){
        if(currentSize>0){
            for(int i=index; i<currentSize-1; i++){
                list[i]=list[i+1];
            }
            list[currentSize-1]=0;
            currentSize--;
        }
    }

    public void traverse(){
        for(int i=0; i<currentSize; i++){
            System.out.println(list[i]+"  ");
        }
    }

    public static void main(String[] args) {
        DynamicArray list=new DynamicArray();
        list.add(1);
        list.add(2);
        list.remove();
        list.add(3);
        list.add(4);
        list.add(5);
        list.removeFrom(0);
        list.addAt(0, 108);
        list.traverse();
    }
}