package SET4P6.payroll.management;

import SET4P6.payroll.staff.Employee;

public class Manager extends Employee{
    public Manager(double salary, double bonus) {
        super(salary, bonus);
    }

    public void giveRaise(double amount) {
        this.salary += amount; // Allowed (protected)
        // this.bonus += 1000; // Not Allowed ( Default: cannot access from different package )
        System.out.println("Manager give raise.\t New Salary: " + this.salary);
    }
}
