package Task;

import java.util.Scanner;

public class Problem_1 {
    static class Calculator {
        double a, b;
        Calculator(double a, double b) { 
        	this.a = a;
        	this.b = b;
        	}

        double add() {
        	return a + b;
        	}
        double subtract() {
        	return a - b; 
        	}
        double multiply() { 
        	return a * b; 
        	}
        Double divide() {
            if (b == 0) 
            	return null;
            return a / b;
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        double a = sc.nextDouble();
        System.out.println("Enter b value:");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter operation (add, subtract, multiply, divide):");
        String op = sc.nextLine().trim().toLowerCase();

        Calculator calc = new Calculator(a, b);
        switch (op) {
            case "add":
                System.out.println("Result: " + calc.add());
                break;
            case "subtract":
                System.out.println("Result: " + calc.subtract());
                break;
            case "multiply":
                System.out.println("Result: " + calc.multiply());
                break;
            case "divide":
                Double res = calc.divide();
                if (res == null) 
                	System.out.println("Error: Division by zero");
                else 
                	System.out.println("Result: " + res);
                break;
            default:
                System.out.println("Unknown operation. Use add, subtract, multiply, divide.");
        }
        sc.close();
	}

}
