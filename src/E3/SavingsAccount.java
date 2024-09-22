package E3;

/**
 * Represents a savings account, subclassing Account class.
 */
public class SavingsAccount extends Account {
    /**
     * Interest rate.
     * @implNote 0.01 rate = 1% interest rate.
     */
    final private double interestRate;

    /**
     * Initializes an instance of SavingsAccount.
     *
     * @param rate - Interest rate.
     * @param balance - Balance in account.
     * @param name - Name of account owner.
     *
     * @implNote 0.01 rate = 1% interest rate.
     */
    public SavingsAccount(double rate, double balance, String name) {
        super(balance, name);
        this.interestRate = rate;
    }

    /**
     * Calculates and deposits interest in account balance.
     */
    public void addInterest() {
        super.deposit(this.interestRate * super.balance);
    }

    /**
     * Transfers funds between accounts.
     * @param amount - Amount to be transferred.
     * @param account - Receiving account.
     */
    public void transfer(double amount, Account account) {
        if (amount <= super.balance) {
            super.withdraw(amount);
            account.deposit(amount);
            System.out.println("Transaction successful");
        } else {
            System.out.println("Transaction failed. Insufficient funds!");
        }

    }
}
