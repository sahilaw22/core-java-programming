// Find Common Elements Between Two Lists

import java.util.*;

public class SET4P9 {

    public static List<Integer> commonElements(List<Integer> c1,List<Integer> c2) {

        c1.retainAll(c2); //keeps on common , removes other and modifies list1 | return true/false
        List<Integer> newlist = c1;

        return newlist;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,6,7));

        System.out.println(commonElements(list1,list2));
    }
}
