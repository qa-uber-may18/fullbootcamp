package testpackage;

public class TestVehicleInsuarancePolicy {



	public static void main(String[] args) {
		
		System.out.println("Program test");
		System.out.println("Changes for Git exercises");
		System.out.println("More chaches for Git tracking");
		
		VehicleInsurancePolicy anna = 
		new VehicleInsurancePolicy("Anna", 2015, "Mazda", 0, 100);
		Double annaMonthlyPayment = anna.checkPayments();
		System.out.println("Anna's monthly payment is: " + annaMonthlyPayment);
		
		VehicleInsurancePolicy john = 
		new VehicleInsurancePolicy("John", 2013, "Honda", 1, 200);
		Double johnMonthlyPayment = john.checkPayments();
		System.out.println("John's monthly payment is: " + johnMonthlyPayment);
		
		Double annaAfterCollisions = anna.increseOfPaymentAfterCollisons(7);
		System.out.println("Anna's payment after collision: " + annaAfterCollisions);
		
		Double johnAfterCollisions = john.increseOfPaymentAfterCollisons(3);
		System.out.println("John's payment after collision: " + johnAfterCollisions);
		
		anna.addCollisionNumber(3);
		System.out.println("Anna's total collisions number is: " + anna.checkCollisionsAmount());

	}

}

