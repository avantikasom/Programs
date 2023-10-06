import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWord{
     public static String[] uncommonFromSentences(String s1, String s2) {
        
      Map<String, Integer> map = new HashMap<>();
      for (String word : s1.split(" ")) {
        map.put(word, map.getOrDefault(word, 0) + 1);
      }

      for (String word : s2.split(" ")) {
        map.put(word, map.getOrDefault(word, 0) + 1);
      }
      List<String> result = new ArrayList<>();
      for (String key : map.keySet()) {
        if (map.get(key) == 1) {
          result.add(key);
        }
      }
      String[] strs = new String[result.size()];
      result.toArray(strs);
      return strs;
    }
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String s1 = sc.nextLine();
        System.out.println("Enter string 2:");
        String s2 = sc.nextLine();
        String[] res =  uncommonFromSentences(s1, s2);
        System.out.println(Arrays.toString(res));
        sc.close();

    }
}