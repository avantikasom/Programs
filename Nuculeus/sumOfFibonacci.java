package Nuculeus;
import java.util.Scanner;
public class sumOfFibonacci {
    public static int fib(int n){
        if(n==0)
        return 0;
        else if( n==1 )
        return 1;
        else 
        return fib(n-1) + fib (n-2);
    }

    public static void main(String[] args){
        System.out.print("Enter the number of terms in the fibonacci series:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int N = arr.length-1;
        int sum= 0;
        for(int i=0; i< n ; i++){
            //System.out.print(fib(i) + " ");
            arr[i] = fib(i);
        }
        // for(int i=0; i< n ; i++){
        //     System.out.print(arr[i] + " ");
           
        // }
        for(int i=N; i>N-3 ; i--){
            System.out.print(arr[i] + " ");
            sum = sum +  arr[i];
           
        }
        System.out.println();
        System.out.println(sum);
        

        sc.close();

    }
    
}
