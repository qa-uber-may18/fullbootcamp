package testpackage;
+
+public class VehicleInsurancePolicy {
+	
+	private String ownerName;
+	private int carYear;
+	private String carBrand;
+	private int collisionsNumber;
+	private double monthlyPayment;

	private double carMileage; //- for Git practice
+
+	public VehicleInsurancePolicy(String name, int year, String   brand, int collisions, 
+			double payment) {
+		this.ownerName = name;
+		this.carYear = year;
+		this.carBrand = brand;
+		this.collisionsNumber = collisions;
+		this.monthlyPayment = payment;
+	} 
+	
+
+    public double getmonthlyPayment() { 
+        return monthlyPayment; 
+    } 
+    
+    public void setmonthlyPayment(double payment) { 
+        this.monthlyPayment = payment; 
+    } 
+    
+    public double getcarYear() { 
+        return carYear; 
+    } 
+    
+    public void setcarYear(double year) { 
+        this.monthlyPayment = year; 
+    } 
+	
+    public String getcarBrand() {
+    	return carBrand;
+    }
+    
+    public void setcarBrand(String brand) {
+    	this.carBrand = brand;
+    }
+    
+    public String getownerName() {
+    	return ownerName;
+    }
+    
+    public void setownerName(String name) {
+    	this.ownerName = name;
+    }
+    
+    public double getcollisionsNumber() {
+    	return collisionsNumber;
+    }
+    
+    public void setcollisionsNumber(int collisions) {
+    	this.collisionsNumber = collisions;
+    }
+    
+	public double checkPayments() {
+		return monthlyPayment;
+	}
+	
+	public double increseOfPaymentAfterCollisons(int collisions) {
+		if (collisions > 5) {
+			monthlyPayment = monthlyPayment + 50; 
+		}
+		return monthlyPayment;
+	}
+	
+	public void addCollisionNumber(int number) {
+		collisionsNumber = collisionsNumber + number;
+	}
+	
+	public double checkCollisionsAmount() {
+		return collisionsNumber;
+	}
+	
+}// end of class
