import java.util.*;
class GroupElements{
	static int[] solution(int[] array){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(Integer i:array){
			map.put(i,map.getOrDefault(i,0)+1);
		}
		int[] newArray=new int[array.length];
		int index=0;
		for(int i:array){
			if(map.containsKey(i)){
				int frequency=map.get(i);
				map.remove(i);
				for(int j=0;j<frequency;j++){
					if(index<array.length){
						newArray[index]=i;
						index++;					
					}
				}
			}
		}
		return newArray;
	}
	public static void main(String[] args){
		int[] array={ 5, 4, 5, 5, 3, 1, 2, 2, 4};
		int[] solved=solution(array);
		for(int i:solved){
			System.out.print(i+", ");
		}
	}
}