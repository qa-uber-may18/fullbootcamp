public class TestCitiBankAccount extends HSBCBankAccount {
    public TestCitiBankAccount(int accountNumber, double balance, String customerName) {
        super(accountNumber, balance, customerName);
    }

    public static void main(String[] args) {


        TestCitiBankAccount alla = new TestCitiBankAccount(1222, 3000, "alla");
        TestCitiBankAccount rob = new TestCitiBankAccount(1223, 5000, "rob");
        TestCitiBankAccount vany = new TestCitiBankAccount(1224, 2000, "vany");
        TestCitiBankAccount lena = new TestCitiBankAccount(1225, 1000, "lena");
        TestCitiBankAccount peter = new TestCitiBankAccount(1226, 3500, "peter");


        TestCitiBankAccount[] bankAccount = new TestCitiBankAccount[10];
        bankAccount[0] = alla;
        bankAccount[1] = rob;
        bankAccount[2] = vany;
        bankAccount[3] = lena;
        bankAccount[4] = peter;


        for (int i = 0; i <= 4; i++) {
            bankAccount[i].deposit(100.00);

            double x = bankAccount[i].getBalance();
            System.out.println(x);
        }
    }
        }
