

public class HouseInsurance {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private int houseYear;
    private double costHouse;
    private double damageCost;


    public HouseInsurance(int number, String name, double balance, int hyear, double cost, double damage) {

        accountNumber = number;
        accountHolderName = name;
        accountBalance = balance;
        houseYear = hyear;
        costHouse = cost;
        damageCost = damage;
    }

    public void deposit(double amount) {
        accountBalance = accountBalance + amount;
    }

    public String accountHolderName() {

        return accountHolderName;

    }

    public void damagePay(double amount) {

        accountBalance = accountBalance + amount;

    }

    public double checkBalance() {
        return accountBalance;
    }
}
