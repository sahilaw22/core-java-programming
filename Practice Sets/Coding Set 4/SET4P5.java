// Find the Maximum and Minimum Elements in a List

import java.util.*;

public class SET4P5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,45,7,65); // get(), replace(index,new element) only
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Maximum number in list: " + max);
        System.out.println("Minimum number in list: " + min);
    }
}
