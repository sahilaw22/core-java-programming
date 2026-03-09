import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateList {
    public static void main(String[] args) {
        List<Integer> original = Arrays.asList(1, 2, 1, 3, 4, 4);
        System.out.println("Original list: " + original);

        Set<Integer> uniqueSet = new LinkedHashSet<>(original);
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);

        System.out.println("Unique list: " + uniqueList);
    }
}
