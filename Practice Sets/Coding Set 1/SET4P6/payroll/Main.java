/* 6. Company Payroll System */

package SET4P6.payroll;
import SET4P6.payroll.finance.Finance;
import SET4P6.payroll.management.Manager;
import SET4P6.payroll.staff.HR;
import SET4P6.payroll.staff.Employee;


public class Main {
        public static void main(String[] args) {

            Employee emp = new Employee(60000, 1000);
            HR hr = new HR();
            Manager manager = new Manager(10000,500);
            Finance finance = new Finance();

            System.out.println("=== Initial Info ===");
            emp.displayInfo();
            manager.displayInfo();

            System.out.println("\n=== HR Updating Salary ===");
            hr.updateSalary(emp, 85000);

            System.out.println("\n=== Manager Giving Raise ===");
            manager.giveRaise(15000);
            manager.displayInfo();

            System.out.println("\n=== Finance Processing Payroll ===");
            finance.processPayroll(emp);
        }
    }

