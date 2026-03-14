/* Create a class Employee with attributes name, designation, and salary. Initialize them using a constructor and display the employee information. */

import java.util.*;

class Employee {
    String name;
    String designation;
    double salary;

    Employee(String n, String d, double s) {
        name = n;
        designation = d;
        salary = s;
    }

    void Display() {
        System.out.println("Employee name: " + name + "\nDesignation: " + designation + "\nSalary: " + salary);
    }
}

public class SET2P3 {
    public static void main(String[] args){
        Employee e1 = new Employee("Alakh Panday", "Founder & CEO",14000.80);
        e1.Display();
    }
}
