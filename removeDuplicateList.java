// Remove duplicates in a list

import java.util.*;

public class removeDuplicateList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,1,3,4,4));
        System.out.println("Original list: " + list);
        Set<Integer> set = new HashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("Unique list: " + uniqueList);
    }
}