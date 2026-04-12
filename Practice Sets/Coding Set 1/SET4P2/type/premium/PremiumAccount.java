
package SET4P2.type.premium;
import SET4P2.type.bank.BankAccount;

public class PremiumAccount extends BankAccount{

        public PremiumAccount(double initialBalance) {
            super(initialBalance);
            this.accountType = "Premium";

        }
        public void showPremiumBenefits() {
            System.out.println("===Premium Account Features=== ");
            showType();
        }
    }

