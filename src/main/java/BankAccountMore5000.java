import java.util.ArrayList;

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
        ArrayList<HSBCBankAccount> bArrayList = new ArrayList<HSBCBankAccount>();
        bArrayList.add(a);
        bArrayList.add(b);
        bArrayList.add(c);
        bArrayList.add(d);
        bArrayList.add(f);
        bArrayList.add(g);
        bArrayList.add(h);
        bArrayList.add(j);
        bArrayList.add(k);
        bArrayList.add(m);


        HSBCBankAccount[] bankAccount = {a, b, c, d, f, g, h, j, k, m};

        for (int i = 0; i < bankAccount.length; i++) {
            ((HSBCBankAccount) bankAccount[i]).deposit(1000);
            System.out.println(bankAccount[i].getBalance());

        }
    }
}


