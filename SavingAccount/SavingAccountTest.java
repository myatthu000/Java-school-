// SavingAccountTest
package SavingAccount;

public class SavingAccountTest {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);

        System.out.println("\nSaver1 balance= "+saver1.getSavingBalance());
        System.out.println("\nSaver2 balance= "+saver2.getSavingBalance());
        SavingAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("\nPercent Interest :\nSaver1 balance=%.2f ",saver1.getSavingBalance());
        System.out.printf("\nSaver2 balance=%.2f \n",saver2.getSavingBalance());
        SavingAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("\n5 Present Interest:\nSaver1 balance=%.2f", saver1.getSavingBalance());
        System.out.printf("\nSaver2 balance=%.2f \n",saver2.getSavingBalance());
        
    }
    
}
