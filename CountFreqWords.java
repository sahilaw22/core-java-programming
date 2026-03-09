// count the frequency of words in a sentence
import java.util.*;

public class CountFreqWords {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for(String word : words) {
            if (map.containsKey(word))
                map.put(word,map.get(word) + 1);
            else
                map.put(word,1);
        }
        for (String key : map.keySet()) {
            System.out.println(key +":" + map.get(key));
        }

    }

}