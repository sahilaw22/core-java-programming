/* 2. Banking App - Limited Access */

package SET4P2.type.main;
import SET4P2.type.bank.BankAccount;
import SET4P2.type.premium.PremiumAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        System.out.println("Standard Account | Initial Balance: " + account.checkBalance() + "\n");

        PremiumAccount premium = new PremiumAccount(10000);
        premium.showPremiumBenefits();
        System.out.println("Premium Account | Initial Balance: " + premium.checkBalance());
        premium.withdraw(2000);
        System.out.println("Premium Account | Balance: " + premium.checkBalance());
    }
}
