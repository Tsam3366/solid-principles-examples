package singleresponsibilityprinciple;

public class Application {
    public static void main(String[] args) {

        //Creating BankAccount Object
        BankAccount bankAccount = new BankAccount("SBI123456", 1000000.00);
        //Viewing BankAccount details
        bankAccount.getDetails();

        //Depositing 1000 bucks
        bankAccount.depositAmount(1000);
        //Viewing Updated acc. info
        bankAccount.getDetails();

        //Withdraw amount
        bankAccount.withdraw(999999);
        bankAccount.getDetails();

        //Generate Statement
        AccountStatementGeneration accountStatementGeneration=new AccountStatementGeneration();
        accountStatementGeneration.generateAccountStatement(bankAccount);




    }
}
