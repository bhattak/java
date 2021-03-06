package hello;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the value ...");
			int n=sc.nextInt();
			System.out.println("You entered "+n);
		} catch (InputMismatchException e) {
			System.out.println("Please enter integer value");
		}
		sc.close();
	}
}
