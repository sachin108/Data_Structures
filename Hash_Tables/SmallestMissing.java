import java.util.*;
class SmallestMissing{
	static int solution(Integer[] array){
		int lengthOFarray=array.length;
		HashSet<Integer> set=new HashSet<>();
		Collections.addAll(set,array);
		int index=1;
		while(true){
			if(!(set.contains(index))){
				return index;
			}
			index++;
		}
	}
	public static void main(String[] args){
		Integer[] ar={1, 4, 2, -1, 6, 5};
		int smallestMissingNumber=solution(ar);
		System.out.println("Smallest Missing Number is "+smallestMissingNumber);
	}
}