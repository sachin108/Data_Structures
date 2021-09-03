// without sorting
import java.util.*;
public class Target_sum{
	static ArrayList<ArrayList<Integer>> targetSumIndexes(int[] array,int target){
		HashMap<Integer,Integer> map=new HashMap<>();
		ArrayList<ArrayList<Integer>> indexes=new ArrayList<ArrayList<Integer>>();
		int length_of_array=array.length-1,first;
		for(int i=0;i<=length_of_array;i++){
			if(map.containsKey(array[i])){
				ArrayList<Integer> list=new ArrayList<>();
				list.add(i);
				list.add(map.get(array[i]));
				indexes.add(list);
			}
			else{
				map.put(target-array[i],i);
			}
		}
		return indexes;
	}
	public static void main(String[] args){
		int target=9;
		int[] array={2,5,6,4,7,3,1,7,9,8};
		ArrayList<ArrayList<Integer>> index=targetSumIndexes(array,target);
		for(ArrayList<Integer> i:index){
			for(int j:i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}