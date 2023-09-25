public class Hexaview_interview_pattern {
    public static void main(String[] args){
        String str = "AVANTIKAA";
        int n = str.length();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            for(int k = i ; k < n-i ; k++){
                System.out.print(str.charAt(k));
            }
            System.out.println();
        }
    }
}
