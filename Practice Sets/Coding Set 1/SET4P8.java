/* 8. Login Attempt System */

import java.util.Scanner;

class AccountLockedException extends Exception {
    public AccountLockedException(String msg) {
        super(msg);
    }
}

public class SET4P8 {
    public static void main(String[] args) {
        System.out.println("--Login Attempt System--");
        String user = "admin";
        String password = "1234";
        Scanner sc = new Scanner(System.in);

        int attempts = 0;

        while (attempts < 3) {
            try {
                System.out.print("Enter username: ");
                String userInput = sc.nextLine();
                System.out.print("Enter password: ");
                String userPass = sc.nextLine();
                if (!userInput.equals(user) || !userPass.equals(password)) {
                    throw new Exception("Invalid Credentials");
                }
                System.out.println("Login Successfully");
                break;
            } catch (Exception e) {
                attempts++;
                System.out.println("Wrong Input! Attempt left: " + (3 - attempts));
                if (attempts == 3) {
                    try {
                        throw new AccountLockedException("Your Account is Locked!\nContact Support for help");
                    } catch (AccountLockedException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
    }
}