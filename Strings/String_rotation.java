//Given two strings, the task is to find if a string can be obtained by rotating 
//another string two places. 
import java.util.*;
public class String_rotation{
	public static void main(String[] args){
		String original_string="Atlantis",right_rotated_string="lantisAt";
		String left_rotated_string="isAtlant",wrong_string="lantistA";
		
		int strlen=original_string.length(), rotation_by=2;
		String left_rotation=original_string.substring(strlen-2)+original_string.substring(0,strlen-2);
		String right_rotation=original_string.substring(2,strlen)+original_string.substring(0,2);

		if(left_rotated_string.equals(left_rotation)){
			System.out.printf("Yes, %s  is rotation of original string\n",left_rotated_string);
		}
		
		if(right_rotated_string.equals(right_rotation)){
			System.out.printf("Yes, %s  is rotation of original string\n",right_rotated_string);
		}

		if(left_rotated_string.equals(wrong_string) || right_rotated_string.equals(wrong_string)){
			System.out.printf("Yes, %s  is rotation of original string\n",wrong_string);
		}
		else{
			System.out.printf("%s is not a rotation of original string",wrong_string);
		}
	}
}
