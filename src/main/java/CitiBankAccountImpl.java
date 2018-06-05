public class CitiBankAccountImpl implements TestBankInterface {
     private int accountNumber;
     private double balance;
     private String customerName;
     private double amount;

    public CitiBankAccountImpl(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public static void main(String[] args) {


        TestBankInterface alla = new CitiBankAccountImpl(1222, 1, "alla");
        TestBankInterface rob = new CitiBankAccountImpl(1223, 1, "rob");
        TestBankInterface vany = new CitiBankAccountImpl(1224, 1, "vany");
        TestBankInterface lena = new CitiBankAccountImpl(1225, 1, "lena");
        TestBankInterface peter = new CitiBankAccountImpl(1226, 1, "peter");

        TestBankInterface steve = new HSBSBankAccountImpl(123, 1, "steve") {
        };

        TestBankInterface[] bankAccount = {alla, rob, vany, lena, peter, steve};


//        bankAccount[0] = alla;
//        bankAccount[1] = rob;
//        bankAccount[2] = vany;
//        bankAccount[3] = lena;
//        bankAccount[4] = peter;

        double result = 0;

        for (int i = 0; i < bankAccount.length; i++) {
            double x = bankAccount[i].getBalance();
            if(i >= 5) {
                result = result + x;
                System.out.println(result);
            }

//            System.out.println(x);
//            String name = bankAccount[5].getCustomerName();
//            System.out.println(name);
        }



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





