import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        String input = sc.nextLine();

        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
