public class QAUberBank implements TestBankInterface {

        protected int accountNumber;
        protected double balance;
        protected String customerName;

        public QAUberBank(int accountNumber, double balance, String customerName) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
        }

        public void maxBalance(double amount) {
            if (amount >= 5000)
                System.out.println(amount);
        }
// from Interface
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