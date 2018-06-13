public class CitiBankAccountImpl implements TestBankInterface {
     private int accountNumber;
     private double balance;
     private String customerName;
     private double amount;

    /**
     * CitiBankAccount - accounts constructor
     * @param accountNumber
     * @param balance
     * @param customerName
     */
    public CitiBankAccountImpl(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public static void main(String[] args) {
/**
 * CitiBankAccount - ArrayList
 */

        TestBankInterface alla = new CitiBankAccountImpl(1222, 1000, "alla");
        TestBankInterface rob = new CitiBankAccountImpl(1223, 2000, "rob");
        TestBankInterface vany = new CitiBankAccountImpl(1224, 3000, "vany");
        TestBankInterface lena = new CitiBankAccountImpl(1225, 2500, "lena");
        TestBankInterface peter = new CitiBankAccountImpl(1226, 1100, "peter");

        TestBankInterface steve = new HSBSBankAccountImpl(123, 1200, "steve"); {
        }

        TestBankInterface[] bankAccount = {alla, rob, vany, lena, peter, steve};


//        bankAccount[0] = alla;
//        bankAccount[1] = rob;
//        bankAccount[2] = vany;
//        bankAccount[3] = lena;
//        bankAccount[4] = peter;
//        bankAccount[5] = steve;

        double result = 0;

        for (int i = 0; i < bankAccount.length; i++) {

            double x = bankAccount[i].getBalance();

                result = result + x;


//            System.out.println(x);
//            String name = bankAccount[5].getCustomerName();
//            System.out.println(name);
        }                System.out.println(result);


/**
 * This is methods from HSBCBankAccount class
 */

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

    public String getCustomerName() {
        return customerName;
    }
}





