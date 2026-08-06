// SavingAccount
package SavingAccount;

public class SavingAccount {
    private static double annualInterestRate;
    private double savingBalance;
    public SavingAccount(){
        annualInterestRate = 1;
        savingBalance = 0.0f;
    }

    public SavingAccount(double Balance){
        setSavingBalance(Balance);
    }

    public void setSavingBalance(double balance){
        savingBalance = balance;
    }

    public double getSavingBalance(){
        return savingBalance;
    }

    public void calculateMonthlyInterest(){
        savingBalance += (savingBalance*annualInterestRate)/12.0;
    }

    public static void modifyInterestRate(double newInterestRate){
        if(newInterestRate>=0){
            int i;
            annualInterestRate = newInterestRate;
        }
    }
}
