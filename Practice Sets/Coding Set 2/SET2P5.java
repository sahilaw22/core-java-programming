/* Create a class Student that stores marks of 5 subjects in an array. Use a constructor to initialize the array and write a method to calculate the average marks. */

import java.util.*;

class Students {
    private int[] marks;

    public Students(int[] markArray) {
        this.marks = new int[5];
        for (int i = 0; i < 5 ; i++) {
            this.marks[i] = markArray[i];
        }

    }
    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 5.0;
    }

}

public class SET2P5 {
    public static void main(String[] args){
        int[] marks = {89,34,56,67,78};
        Students s1 = new Students(marks);
        System.out.println("Average mark of 5 subjects: " + s1.calculateAverage());

    }
}
