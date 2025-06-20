package junit;

public class BankAccount {
    private Integer balance;

    // Create a constructor
    public BankAccount(Integer initialBalance) {
        balance = initialBalance;
    }

    // Add method to calculate
    // balance amount after withdrawal
    public Integer withdraw(Integer amount) throws NotEnoughFundsException {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }
}
