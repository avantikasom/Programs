
    import java.util.Scanner;
class removecharacter{
    public static String removeChars(String string1, String string2){
       
    StringBuilder s  = new StringBuilder();
    for(char c : string1.toCharArray()){
        if(string2.indexOf(c) == -1){
            s.append(c);
        }
    }
    return s.toString();
    }
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
        System.out.println("enter string 1:");
         String s1 = sc.nextLine();
        System.out.println("enter String 2:");
         String s2 = sc.nextLine();
      
        
        
        String s = removeChars(s1, s2);
          System.out.println(s);
        
         sc.close();

    }
}
