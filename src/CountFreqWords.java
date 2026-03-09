import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFreqWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("No words entered.");
            return;
        }

        String[] words = input.split("\\s+");
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
