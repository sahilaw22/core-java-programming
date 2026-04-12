/* 3. ATM Withdrawal System */

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

    class NegativeAmountException extends Exception {
        public NegativeAmountException(String msg) {
            super(msg);
        }
    }

    public class SET4P3 {
        static class ATM {
            private double balance;
            protected String accountType = "Standard";

            public double checkBalance() {
                return balance;
            }

            public ATM(double initialBalance) {
                this.balance = (initialBalance > 0) ? initialBalance : 0;
            }

            public void checkSufficientBalance(double amount) throws InsufficientBalanceException {
                if (amount > balance) {
                    throw new InsufficientBalanceException("Your have insufficient balance");
                }
            }

            public void withdraw(double amount) throws InsufficientBalanceException, NegativeAmountException {
                if (amount <= 0) {
                    throw new NegativeAmountException("Withdrawal amount can't be zero or negative");
                }
                checkSufficientBalance(amount);
                balance -= amount;
                System.out.println(amount + " is successfully withdraw");
            }
        }

        static class PremiumAccount extends ATM {

            public PremiumAccount(double initialBalance) {
                super(initialBalance);
                this.accountType = "Premium";

            }
        }

        public static void main(String[] args) {
            System.out.println("--- ATM Withdrawal System ---");
            ATM std = new ATM(5000); // starting balance
            System.out.println("Initial Balance: " + std.checkBalance());

            double[] testAmt = {5000, 7000, -500, 0, 1500};
            for (double amt : testAmt) {
                try {
                    std.withdraw(amt);
                } catch (InsufficientBalanceException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (NegativeAmountException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            try {
                String invalidInput = "nondigit";
                double parsed = Double.parseDouble(invalidInput);
                std.withdraw(parsed);
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid numeric ammount");
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
}


