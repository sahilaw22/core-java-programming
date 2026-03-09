// count the occurance of each character in a string

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountEachChar {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        String sent = sc.nextLine();
        for(char ch : sent.toCharArray()) {
            if (map.containsKey(ch))
                map.put(ch,map.get(ch) + 1);
            else
                map.put(ch,1);
        }
        for (char key : map.keySet()) {
            System.out.println(key +":" + map.get(key));
        }
    }
}
