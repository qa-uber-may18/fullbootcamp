public class HSBSBankAccountImpl implements TestBankInterface {

        private int accountNumber;
        private double balance;
        private String customerName;

        public HSBSBankAccountImpl(int accountNumber, double balance, String customerName) {
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


    public void deposit(double amount) {
        balance = balance + amount;
    }


    public double getBalance() {
        return balance;
    }


    public String getCustomerName() {
        return customerName;
    }
}