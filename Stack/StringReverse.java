import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        String str="801NIHCAS";
        char[] chars=str.toCharArray();
        for(char c:chars){
            stack.push(c);
        }
        for (int index = 0; index < str.length(); index++) {
            chars[index]=stack.pop();
        }
        for(char c: chars){
            System.out.print(c);
        }
    }
}
