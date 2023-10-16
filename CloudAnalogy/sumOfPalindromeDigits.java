// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
public class sumOfPalindromeDigits {
    public static int[] isPalindrome(int n1 , int n2){
        int[] arr = new int[n2-n1];
        int k=0;
        for(int i=n1+1;i<n2;i++){
            int r=0;
            int x = i;
            int temp =i;
            while(temp!=0){
                int d = temp%10;
                r = r*10+d;
                temp=temp/10;
            }
            if(x==r){
                
                arr[k] = x;
                k++;
            }
        }
        return arr;
    }
    public static void sumOfPalindrome(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            
            while(arr[i]!=0 ){
                int d = arr[i] %10;
                sum = sum + d;
                arr[i] = arr[i]/10;
                
            }
        }
        System.out.print("Sum is:" + sum);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        int n1 = sc.nextInt();
        System.out.print("Enter num2:");
        int n2 = sc.nextInt();
        
        int[] arr = new int[n2-n1];
        arr =  isPalindrome(n1 , n2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sumOfPalindrome( arr);
        sc.close();
        
        
    }
}



