package bankAccount;

public class HSBCBankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private boolean active;

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

    public void deposit(double amount){
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;

    }
}