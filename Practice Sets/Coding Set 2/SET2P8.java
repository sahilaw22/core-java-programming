/* Create a class Student with attributes name and marks. Create an array of Student objects and display the details of all students. */

import java.util.*;

class Student_{
    private String name;
    private int marks;

    public Student_(String name, int marks) {
        this.name = name;
        this.marks = marks;
        }
        public void Display() {
            System.out.println("Name: " + name + "\nMarks Obtained: " + marks + "\n");
        }

    }

public class SET2P8 {
    public static void main(String[] args){
        Student_[] students = new Student_[4];
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i < students.length ; i++ ) {
            System.out.print("Enter Student " + i + " Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Student " + i + " Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            students[i] = new Student_(name,marks);
        }
        System.out.println("\tSTUDENT DETAILS");
        for (int i = 1; i < students.length; i++ ) {
            students[i].Display();
        }
        sc.close();

    }
}
