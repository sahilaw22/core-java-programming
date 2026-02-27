// Reverse a list

import java.util.*;

public class SET4P6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red","Blue","Green","Yellow");
        System.out.println("list before reverse: " + list);

        Collections.reverse(list); // doesn't return anything
        System.out.println("list after reverse: " + list);
    }
}
