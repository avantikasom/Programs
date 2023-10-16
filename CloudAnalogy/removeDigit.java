import java.util.Scanner;
public class removeDigit{
    public static boolean isPalindrome(int num){
        int n = num;
        int r = 0;
        while ( num != 0){
            int d = num % 10;
            r = r*10 + d;
            num = num/10;
        }
        return n == r;
    }
    
    public static void removeD(int n){
        String str =  Integer.toString(n);
        int length = str.length();
        for(int i=0;i<length;i++){
            int removedDigit = Integer.parseInt(str.substring(0,i)+str.substring(i+1));
            if(isPalindrome(removedDigit)){
                System.out.print( str.charAt(i));
                return;
            }
            
        }
          System.out.print( "no num");
        
    }
    public static void main(String[] args){
        System.out.print("Enter num:");
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt();
        removeD(n);
        //System.out.print(res);
        sc.close();
    }
}
