// https://leetcode.com/problems/find-the-difference/submissions/
import java.util.Scanner;
public class charDifference{
    public static void difference(String s1, String s2){
        // In question s2 is of larger length
        int Sums1 =0 , Sums2 = 0;
        char ch ;
        for(int i=0;i<s1.length() ; i++ ){
            Sums1 =  Sums1 + Integer.valueOf(s1.charAt(i));
        }
        for(int i=0;i<s2.length() ; i++ ){
            Sums2 =  Sums2 + Integer.valueOf(s2.charAt(i));
        }
        ch = (char)(Sums2 - Sums1);
        System.out.println(ch);

    }
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String s1 = sc.nextLine();
        System.out.println("Enter string 2:");
         String s2 = sc.nextLine();
        difference(s1, s2);
        sc.close();
    }
}
