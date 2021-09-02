import java.util.*;
public class Rotations_divisible_by_4{
	public static void main(String[] args){
		String s="43292816";
		int strlen=s.length();
		int total=0;
		if(Integer.parseInt(s.substring(strlen-3))%4==0){
			++total;
		}
		for(int i=1;i<strlen;i++){
			s=s.substring(1,strlen)+s.substring(0,1);
			if(Integer.parseInt(s.substring(strlen-3))%4==0){
				++total;
			}			
		}
		System.out.println(total);
	}
}
