package E3;

/**
 * Represents a bank account.
 */
public class Account {
    /**
     * Bank account balance.
     */
    protected double balance;

    /**
     * Name of account owner.
     */
    private String name = "Anonymous";

    /**
     * Creates an instance with default value.
     */
    public Account() {
        balance = 0;
    }

    /**
     * Creates an instance with specified value.
     * @param balance - Balance in bank account.
     */
    public Account(double balance) {
        this.balance = balance;
    }

    /**
     * Creates an instance with specified values.
     * @param balance - Balance in bank account.
     * @param name - Name of account owner.
     */
    Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    /**
     * Withdraws funds from account.
     * @param amount - Amount to be withdrawn from account.
     * @return - Status message.
     */
    public String withdraw(double amount) {
        if (amount > balance) {
            return "Insufficient Funds";
        } else {
            balance -= amount;
            return "Withdrawn";
        }
    }

    /**
     * Deposits funds into account.
     * @param amount - Amount to be deposited into account.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Returns the name of the account owner.
     * @return - The account owner name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the account owner.
     * @param name - The account owner name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Summarizes an instance of Account.
     * @return - Summary of account.
     */
    public String toString() {
        return String.format("%s has an outstanding balance of %.2f SEK", name, balance);
    }
}
