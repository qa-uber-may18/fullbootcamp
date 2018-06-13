public class TestExceptions {
    public static void main(String[] args) {
        HSBCBankAccount b = new HSBCBankAccount(123, 200, "alla");
        try {
            b.withdraw(100);

        }catch(InsufficientBalanceException e){
            System.out.println("dont have the correct amout");
        }catch (InactiveAccountExcepation d){
            System.out.println("your account inactive");


        }catch (Exception e){
            System.out.println("I don't know what happened");
        }
    }
}
