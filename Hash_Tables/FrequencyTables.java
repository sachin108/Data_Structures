import java.util.*;
public  class FrequencyTables{
	public static void main(String[] args){
		int[] array={1,2,3,4,1,2,13,41,13,12,12,41,13,1,5,6,4,5,7,5,7,41};
		HashMap<String,Integer> frequencyTable=new HashMap<String,Integer>();
		for(int i:array){
			frequencyTable.put("frequency of "+i,frequencyTable.getOrDefault("frequency of "+i,0)+1);
		}
		
		for(Map.Entry<String,Integer> i:frequencyTable.entrySet()){
			System.out.println(i.getKey()+"		"+i.getValue());
		}
	}
}
