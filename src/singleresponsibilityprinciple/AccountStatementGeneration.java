package singleresponsibilityprinciple;

public class AccountStatementGeneration
{
    public void generateAccountStatement(BankAccount account){
        System.out.println("================\nAccount Statement\n================");
        System.out.println("Account Number : "+account.getAccNo());
        System.out.println("Account Balance : "+account.getBalance());
        System.out.printf("==================================");

    }
}
