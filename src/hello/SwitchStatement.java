package hello;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age ");
		int age=sc.nextInt();
		switch (age) {
		case 15: {
			System.out.println("Your age is "+age);
			break;
		}
		case 20:{
			System.out.println("Your age is "+age);
			break;
		}
		default:
			System.out.println("Age out of bound");;
		}
		sc.close();
	}
}
