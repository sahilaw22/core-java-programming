/* 4. Online Form Validation */

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}
class InvalidNameException extends Exception {
    public InvalidNameException(String msg) {
        super(msg);
    }
}
class InvalidEmailException extends Exception {
    public InvalidEmailException(String msg) {
        super(msg);
    }
}
public class SET4P4 {
    public static void checkName(String name) throws InvalidNameException {
        if (name.isEmpty()) {
            throw new InvalidNameException("Name cannot be empty!");
        }
    }
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are a minor. Age must be >= 18");
        }
    }
    public static void checkEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Not a valid email! Email must be abc12@gmail.com format");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        try {
            String name = sc.nextLine();
            checkName(name);

            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine();
            checkAge(age);

            System.out.print("Enter your email: ");
            String email = sc.nextLine();
            checkEmail(email);
        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
