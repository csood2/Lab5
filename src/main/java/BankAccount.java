import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * You may want to use this to distinguish between different kinds of accounts.
         */
        CHECKINGS,
        /**
         * You may want to use this to distinguish between different kinds of accounts.
         */
        SAVINGS,
        /**
         * You may want to use this to distinguish between different kinds of accounts.
         */
        STUDENT,
        /**
         * You may want to use this to distinguish between different kinds of accounts.
         */
        WORKPLACE
    }
    /**
     * this is the account number
     */
    private int accountNumber;
    /**
     * this is the account ntype
     */
    private BankAccountType accountType;
    /**
     * this is the account balance
     */
    private double accountBalance;
    /**
     * this is the account owner name
     */
    private String ownerName;
    /**
     * this gives some info
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     * this gives some info
     * @param accounttype
     */
    public void setAccountType(final BankAccountType accounttype) {
        this.accountType = accounttype;
    }
    /**
     * this gives some info
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * this gives some info
     * @param accountbalance
     */
    public void setAccountBalance(final double accountbalance) {
        this.accountBalance = accountbalance;
    }
    /**
     * this gives some info
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * this gives some info
     * @param ownername
     */
    public void setOwnerName(final String ownername) {
        this.ownerName = ownername;
    }
    /**
     * this gives some info
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * this gives some info
     * @param interestrate
     */
    public void setInterestRate(final double interestrate) {
        this.interestRate = interestrate;
    }
    /**
     * this gives some info
     */
    public double getInterestEarned() {
        return interestEarned;
    }
    /**
     * this gives some info
     * @param interestearned
     */
    public void setInterestEarned(final double interestearned) {
        this.interestEarned = interestearned;
    }
    /**
     * this gives some info
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * this gives some info
     * @param accountnumber uu
     */
    public void setAccountNumber(final int accountnumber)
    {
        this.accountNumber = accountnumber;
    }

    /**
     * this is the account interest rate
     */
    private double interestRate;
    /**
     * this is the amount of interest earned
     */
    private double interestEarned;




    /**
     *
     * @param name is the name of the owner
     * @param accountCategory is the type of the account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        setOwnerName(name);
        setAccountType(accountCategory);
        Bank.totalAccounts = Bank.totalAccounts + 1;
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
