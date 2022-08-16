public class Account implements IAccount{
    private String name;
    private String accountNumber;
    private String email;
    private double accountBalance;

    
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return double return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public void recharge(double amount) {
        this.accountBalance += amount;        
    }

    @Override
    public void changeEmail(String email) {
        this.email = email;       
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Account Number: " + this.accountNumber + ", Email: " + this.email + ", Account Balance: " + this.accountBalance);    
    }
}