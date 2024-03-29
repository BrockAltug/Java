package unit12.exceptions.learning47.customexception;

public class BankMain {
    //practice creating checked exception and printStackTrace from another class to the main using a custom exception
    public static void main(String[] args) throws InsufficientBalanceException {
        //create a new bank account object from the BankAccount class starting with 100 balance
        BankAccount bankAccount = new BankAccount(100, "USD");

        try {
            //will update the balance calling to the method
            bankAccount.withdraw(80);
            //will throw the exception in the catch
            bankAccount.withdraw(100);
        } catch (Exception e) {
            //call to the stack trace for the Exception
            System.out.println("Withdraw Failed");
            e.printStackTrace();
        }
        System.out.println(bankAccount);


        //-------------------

        BankAccount account = new BankAccount(1000.0, "USD");

        try {
            // Attempt to transfer balance with different currency
            account.balanceTransfer(500.0, "EUR");
        } catch (CurrencyMismatchException e) {
            System.out.println("Incorrect Currency: " + e.getMessage());
            e.getStackTrace();
        }
    }
}
