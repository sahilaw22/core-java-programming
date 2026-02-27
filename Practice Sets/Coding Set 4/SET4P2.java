// Remove an Element from a List

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SET4P2 {

    public static List<Integer> removeElement(List<Integer> list, int target ) {
        list.removeIf( num -> num == target );
        return list;
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,2,4,2,5)); // can use add(), remove(), set(), clear()
        int target = 2;

        System.out.println("Element is removed: " + removeElement(numbers,target));

    }
}
