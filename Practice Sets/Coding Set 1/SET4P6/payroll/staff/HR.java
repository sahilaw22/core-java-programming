package SET4P6.payroll.staff;

public class HR {
    public void updateSalary(Employee emp, double newSalary) {
        emp.salary = newSalary;
        emp.bonus = 2000;

        System.out.println("HR updated salary to " + emp.salary);
    }
}
