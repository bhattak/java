package hello;

import java.util.Scanner;

public class FibonacciSeries {
	private void solution1(int n) {
		int prev = 0;
		int cur = 1;
		int next;
		for (int i = 1; i <= n; i++) {
			if (i == 1)
				next = prev;
			else if (i == 2)
				next = cur;
			else {
				next = prev + cur;
				prev = cur;
				cur = next;
			}
			System.out.print(next + " ");
		}
	}

	private void solution2(int n) {
		int first = 0;
		int second = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
	}

	private int nthNumber(int n) {
		int prev = 0;
		int cur = 1;
		int next = 0;
		if (n == 0)
			return 0;
		for (int i = 2; i <= n; i++) {
			next = prev + cur;
			prev = cur;
			cur = next;
		}
		return next;
	}

	private int solution3(int n) {
		if (n <= 1)
			return n;
		return solution3(n - 2) + solution3(n - 1);
	}

	private void solution4(int n) {
		int prev = 0;
		int cur = 1;
		int next;
		for (int i = 0; i < n; i++) {
			if (i <= 1)
				next = i;
			else {
				next = prev + cur;
				prev = cur;
				cur = next;
			}
			System.out.print(next + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number upto which you want to print Fabonacci series ");
		int n = sc.nextInt();
		FibonacciSeries fb = new FibonacciSeries();
//		int num=fb.solution3(n);
//		System.out.println(num);
		fb.solution4(n);
	}
}
