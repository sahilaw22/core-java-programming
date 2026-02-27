// Sort a List in Ascending and Descending Order

import java.util.*;

public class SET4P7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,40,50,10,30,70,90,100,80,60);
        System.out.println("Unsorted list: " + list);

        Collections.sort(list); // return void
        System.out.println("sorted list: " + list);

        Collections.sort(list,Collections.reverseOrder()); // return comparator<T>
        System.out.println("Reverse sorted list: " + list);
    }
}
