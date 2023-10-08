import java.util.Scanner;
import java.util.Arrays;

public class Soritngstring {
    public static void sorting(String str){
        char[] c = str.toCharArray();
        Arrays.sort(c);
        System.out.println(String.valueOf(c));

    }
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String:");
        String str =  sc.nextLine();
        sorting(str);
        sc.close();

    }
}
