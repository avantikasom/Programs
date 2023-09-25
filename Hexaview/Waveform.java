// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Arrays;
public class Waveform{
    public static void waveformFashion(int[] arr){
        for(int i=0;i<arr.length;i=i+2){
            swap(arr, i,i+1);
        }
        for(int i=0;i<arr.length;i++){
            
        
        System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] =  sc.nextInt();
        }
        Arrays.sort(arr);
        waveformFashion(arr);
        sc.close();
    }
}
