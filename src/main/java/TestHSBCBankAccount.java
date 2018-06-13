public class TestHSBCBankAccount extends HSBCBankAccount {
    public TestHSBCBankAccount (int accountNumber, double balance, String customerName){
        super(accountNumber, balance, customerName);
    }

    public static void main(String[] args) throws InsufficientBalanceException {


        TestHSBCBankAccount alla = new TestHSBCBankAccount(1222, 3000, "alla");
        TestHSBCBankAccount rob = new TestHSBCBankAccount(1223, 5000, "rob");
        TestHSBCBankAccount vany = new TestHSBCBankAccount(1224, 2000, "vany");
        TestHSBCBankAccount lena = new TestHSBCBankAccount(1225, 1000, "lena");
        TestHSBCBankAccount peter = new TestHSBCBankAccount(1226, 3500, "peter");


        TestHSBCBankAccount[] bankHSBCAccount = new TestHSBCBankAccount[10];
        bankHSBCAccount[0] = alla;
        bankHSBCAccount[1] = rob;
        bankHSBCAccount[2] = vany;
        bankHSBCAccount[3] = lena;
        bankHSBCAccount[4] = peter;


        for (int i = 0; i <= 4; i++) {
  //          bankHSBCAccount[i].withdraw(50.00);

            double x = bankHSBCAccount[i].getBalance();
            System.out.println(x);
        }
    }
}
