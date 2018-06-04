public class BankAccountMore5000 {
    public static void main(String[] args) {
        HSBCBankAccount a = new HSBCBankAccount(1112, 8000, "Alla");
        HSBCBankAccount b = new HSBCBankAccount(1113, 7000, "Rob");
        HSBCBankAccount c = new HSBCBankAccount(1114, 6000, "David");
        HSBCBankAccount d = new HSBCBankAccount(1115, 5100, "Michle");
        HSBCBankAccount f = new HSBCBankAccount(1116, 5400, "Sasha");
        HSBCBankAccount g = new HSBCBankAccount(1117, 7200, "Steve");
        HSBCBankAccount h = new HSBCBankAccount(1118, 440, "Lena");
        HSBCBankAccount j = new HSBCBankAccount(1119, 450, "Masha");
        HSBCBankAccount k = new HSBCBankAccount(1121, 410, "Nika");
        HSBCBankAccount m = new HSBCBankAccount(1123, 405, "John");


        HSBCBankAccount[] bankAccount = new HSBCBankAccount[10];
        bankAccount[0] = a;
        bankAccount[1] = b;
        bankAccount[2] = c;
        bankAccount[3] = d;
        bankAccount[4] = f;
        bankAccount[5] = g;
        bankAccount[6] = h;
        bankAccount[7] = j;
        bankAccount[8] = k;
        bankAccount[9] = m;


        for (int i = 0; i <= 9; i++) {
            double x = bankAccount[i].getBalance();
            if (x >= 5000) {
                System.out.println(x);
            }
        }
    } // end of main
} // end of class

