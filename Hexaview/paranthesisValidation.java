import java.util.Stack;
import java.util.Scanner;
public class paranthesisValidation {
    public static boolean isValid(String str){
        if(str.length() != 0 ){
            return false;
        } 
        Stack<Character> stack =  new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '(' || c == '{' || c == '[' ){
                stack.push(c);
            }
            else if( c== ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if( c== '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if( c== ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[]  args){
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
         if (!s.matches("[\\[\\]{}()]*")) {
            System.out.print("enter valid string(only brackets)");
        }
        else{

        
        boolean res = isValid(s);
        System.out.println("String is: " + res);
        }
        sc.close();
        }
    
}
