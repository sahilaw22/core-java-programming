// Count the Frequency of Elements in a List

import java.util.*;

public class SET4P8 {

    public static HashMap<String,Integer> countFrequencies(List<String> words) {
        HashMap<String, Integer> res = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);

            int count = 0;
            for (int j = 0; j < words.size(); j++) {
                if (words.get(j).equals(currentWord)) {
                    count++;
                }

            }
            res.put(currentWord,count);
        }
        return res;
    }


    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","apple","orange","banana","apple");
        System.out.println(countFrequencies(words));
    }
}
