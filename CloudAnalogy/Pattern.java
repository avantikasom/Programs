// Online Java Compiler
// Use this editor to write, compile and run your Java code online


public class Pattern{
public static void main(String[] args){
    int N = 6;
    int n =6;
    int x =2;
   
    for(int i=1;i<=N;i++){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }
        
        for(int k = n ; k>=1 ;k--){
            System.out.print(k + " ");
        }
        n--;
        System.out.println();
    }
    
    
     for(int i=4;i>=0;i--){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        
        for(int k = x ; k>=1 ;k--){
            System.out.print(k + " ");
        }
        x++;
        System.out.println();
    }
}
}