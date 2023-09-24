import java.util.Scanner;
public class ReverseString{
    public static void reversal(String str){
        String s= "";
        for(int i=str.length()-1;i>=0;i--){
            s = s + str.charAt(i);
        }
       System.out.print("Reversed string is:" + s);
    }
    public static void main(String[] args){
        System.out.print("Enter the String:");
        Scanner sc  =  new Scanner(System.in);
        String S = sc.nextLine();
        reversal(S);
        sc.close();
    }
}