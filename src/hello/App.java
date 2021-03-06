package hello;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int num1, num2;
		double result;
		String operator;		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		num2 = scanner.nextInt();
		System.out.print("Enter the operator name: ");
		operator = scanner.next();
		
		if (operator.equalsIgnoreCase("add")) {
			result = num1 + num2;
		} else if (operator.equalsIgnoreCase("subtract")) {
			result = num1 - num2;
		} else if (operator.equalsIgnoreCase("multiply")) {
			result = num1 * num2;
		} else if (operator.equalsIgnoreCase("divide")) {
			result = num1 / num2;
		} else {
			result = num1 + num2;			
		}
		
		System.out.println("The result of " + num1 + " " + operator + " " + num2 + " = " + result);
		scanner.close();
	}
}