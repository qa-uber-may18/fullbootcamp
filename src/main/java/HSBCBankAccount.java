
public class HSBCBankAccount {
    int accountNumber;
    double balance;
    String customerName;

    public HSBCBankAccount(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public void maxBalance(double amount) {
        if (amount >= 5000)
            System.out.println(amount);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }
}