
public class HouseInsurance1 {

    public static void main(String[] args) {

        System.out.println("xyz");

        HouseInsurance allaHouse = new HouseInsurance(4455, "Alla", 1000.00, 2017, 400.000, 50.000);

        //String accountName = allaHouse.accountHolderName();
        System.out.println(allaHouse.accountHolderName());

        double x = allaHouse.checkBalance();
        System.out.println(x);

        allaHouse.deposit(100.00);

        double y = allaHouse.checkBalance();

        System.out.println(y);


    }
}

