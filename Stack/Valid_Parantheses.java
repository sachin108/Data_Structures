import java.util.*;
public class Valid_Parantheses{
	
	static boolean isValid(String s){
		char[] array=s.toCharArray();
		char a;
		Stack<Character> stack=new Stack<>();
		for(char i:array){
			if(i=='('||i=='{'||i=='['){
				stack.push(i);
			}
			if(stack.isEmpty())
				return false;
			else{
				switch(i){
					case ')':
						a=stack.peek();
						if(a=='}'||a==']')
							return false;
						stack.pop();
						break;
						
					case '}':
						a=stack.peek();
						if(a==')'||a==']')
							return false;
						stack.pop();
						break;
						
					case ']':
						a=stack.peek();
						if(a==')'||a==']')
							return false;
						stack.pop();
						break;
				}
			}
		}
		return stack.isEmpty()?true:false;
	}
	
	public static void main(String[] args){
		System.out.println("enter a string of brackets");
		Scanner input=new Scanner(System.in);
		boolean valid=isValid(input.next());
		if(valid){
			System.out.print("Yes it is a valid string of brackets");
		}
		else{
			System.out.print("Nope... :(");
		}
	}
}
