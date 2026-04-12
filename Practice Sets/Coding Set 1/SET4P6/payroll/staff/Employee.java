package SET4P6.payroll.staff;

public class Employee{
    protected double salary;
    double bonus; // by default package private


    public Employee(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    public void displayInfo() {
        System.out.println("Salary: " + salary + "\nBonus: " + bonus);
    }
}

