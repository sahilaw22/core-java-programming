// Convert an Array to a List and Vice Versa

import java.util.Arrays;
import java.util.List;

public class SET4P4 {
    public static void main(String[] args) {
        Integer[] arr = {2,3,5,7,11,13};
        List<Integer> list = Arrays.asList(arr);
        System.out.println("Array to List Conversion: " + list);

        Integer[] newArr = list.toArray(arr); // also can use (new integer[0]) means i want integer type array which auto adjust size bases on list
        System.out.println("list to Array Conversion: " + Arrays.toString(newArr));





    }
}
