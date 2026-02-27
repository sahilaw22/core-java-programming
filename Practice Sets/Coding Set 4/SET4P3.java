// Check if a List Contains a Specific Element

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SET4P3 {
    public static void main(String[] args) {
        List<String> Student = Arrays.asList("Rahul","Sahil","Angad","Karan");
        System.out.print("Search any Student to Check is present or not: ");
        Scanner st = new Scanner(System.in);
        String name = st.nextLine();
        if (Student.contains(name)) {
            System.out.println("Student is Present");
        } else {
            System.out.println("Student is Absent");
        }
    }
}
