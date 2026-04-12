/* 1. Secure University Result System */

package SET4P1.main;
import SET4P1.college.Result;
import SET4P1.college.Admin;

public class Main {
public static void main(String[] args) {
    Result student = new Result(75);
    System.out.println("Student marks: " + student.getMarks());

    Admin admin = new Admin();
    admin.changeStudentResult(student, 95);
    System.out.println("Student marks: " + student.getMarks());
    }
}
