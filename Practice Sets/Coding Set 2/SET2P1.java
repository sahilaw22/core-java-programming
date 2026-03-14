/* Create a class Student with data members name and rollNo. Use a constructor to initialize them and display the student details. */

class Student {
    String name;
    int rollNo;

    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

}
public class SET2P1 {
    public static void main(String [] args) {
        Student s1 = new Student("Sahil Ahmed Wani",241103040);

        System.out.println("Name: " + s1.name + "\nRoll No: " + s1.rollNo);
    }
}
