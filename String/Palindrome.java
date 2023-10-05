import java.util.Scanner;
public class Palindrome {
    
        static void isPalindrome(String S) {
            S = S.toLowerCase();
          int n = S.length();
          for(int i=0;i<n/2;i++){
              if(S.charAt(i) != S.charAt(n-i-1)){
                  //return 0;
                  System.out.println("Not palindrome");
                  return;
              }
          }
          //return 1;
          System.out.println("Plaindrome");
          return;
        
        
        
        
        
        }    
        
        public static void main(String[] args){
            System.out.println("Enter string: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            isPalindrome(s);
            sc.close();
                
        }

}
