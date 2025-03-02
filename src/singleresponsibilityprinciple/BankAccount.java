package singleresponsibilityprinciple;

public class BankAccount {
    private String accNo;
    private double balance;

    public BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
        return this.accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void getDetails() {
        System.out.println("Account Number :: " + accNo);
        System.out.println("Current Balance :: " + balance);
    }


    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Current Balance After Deposit :: " + balance);
    }

    public void withdraw(double amount) {
        if (balance <= 1000) {
            System.out.println("Minimum balance 100 should be maintained :: Please dont try to withdraw it...");
        } else {
            if (balance - amount <= 1000) {
                System.out.println("Insufficient balance!!!");
            }
            else {
                balance-=amount;
            }
        }
    }
}
