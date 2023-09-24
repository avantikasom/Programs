import java.util.Scanner;
public class ReverseWords {
    public static void reverseWords(String str){
        String[] words = str.split(" ");
        int n = words.length;
        //StringBuilder s = new StringBuilder();
        String s = "";
        for(int i=n-1;i>=0;i--){
            //s.append(words[i] + " ");
            s = s + words[i] + " ";
            
            
        }
        s = s.trim();
        System.out.print("String after reversal is :" + s);
    }
    public static void main(String[] args){
        System.out.print("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverseWords(s);
        sc.close();
        
        
    }
}