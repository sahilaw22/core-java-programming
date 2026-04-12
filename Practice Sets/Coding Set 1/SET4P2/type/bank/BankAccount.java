
package SET4P2.type.bank;

public class BankAccount{
        private double balance;
        protected String accountType = "Standard";
        public BankAccount(double initialBalance) {
            this.balance = (initialBalance > 0)? initialBalance : 0;

        }
            public double checkBalance() {
                return balance;
            }
        public void withdraw(int amount)  {
            if (balance > 0 || amount < balance ) {
                balance -= amount;
                System.out.println(amount + " is Successfully Withdraw\nYour Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
        protected void showType() {
            System.out.println("Account Type: " + accountType);
        }
    }
