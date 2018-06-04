public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator x = new Calculator();
        Calculator cal = new Calculator();
        double result = cal.add(1.0, 1.0, 1.0, 1.0);
        double resultSecond = cal.add(2, 5, 8);
        double resultThird = cal.add(2, 7);
        System.out.println(result);
        System.out.println(resultSecond);
        System.out.println(resultThird);
    }//end of main

    public double add(double a, double b) {
        double sum = 0;
        sum = a + b;
        return sum;
    }

    public double add(double a, double b, double c) {
        double sum = 0;
        sum = a + b + c;
        return sum;
    }

    public double add(double a, double b, double c, double d) {
        double sum = 0;
        sum = a + b + c + d;
        return sum;
    }
}