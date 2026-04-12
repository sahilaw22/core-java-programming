package SET4P6.payroll.finance;
import SET4P6.payroll.staff.Employee;

public class Finance {
    public void processPayroll(Employee emp) {
        // emp.salary = 10000;
        /* Compilation Error: cannot access protected member
        from different package without inheritance
        */
        emp.displayInfo(); // Allowed (public method)

        System.out.println("Finance can only view through public method");
    }
}
