import java.util.Stack;
import java.util.Scanner;


public class removeAdjacentDuplicate {
    
    public static String removeDuplicates(String s) {
        Stack<Character> stack= new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder string = new StringBuilder();
        while(!stack.isEmpty()){
            string.insert(0,stack.pop());
        }
        return string.toString();
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        String res = removeDuplicates(s);
        System.out.println("Resultant string is:" + res);
        sc.close();
    }
}

