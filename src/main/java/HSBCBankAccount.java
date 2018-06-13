/**
 * HSBCBankAccount - accounts information class
 */
public class HSBCBankAccount {
    /**
     * This account number will be unique for each customer
     */
    private int accountNumber;
    /**
     * This balance will given current number of money for each account
     */
    private double balance;
    private String customerName;
    private boolean active;

    /**
     * This constructor use to create HSBCBankAccount objects
     * @param accountNumber
     * @param balance
     * @param customerName
     */
    public HSBCBankAccount(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.active =true;
    }
    public void inactiveteAccount(){
        active= false;
    }

    public void maxBalance(double amount) {
        if (amount >= 5000)
            System.out.println(amount);
    }

    /**
     * This method will allow customer to withdraw money
     * @param amount
     * @throws InsufficientBalanceException
     * @throws InactiveAccountExcepation
     */
    public void withdraw(double amount) throws InsufficientBalanceException, InactiveAccountExcepation {
        if(! active){
            InactiveAccountExcepation d =new InactiveAccountExcepation();
            throw d;
        }
        if (amount <= balance) {
            balance = balance - amount;
        }else{
            InsufficientBalanceException ise = new InsufficientBalanceException();
                throw ise;


        }
    }

    /**
     * This method will allow customer to deposit money
     * @param amount
     */
    public void deposit(double amount){
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;

    }
}