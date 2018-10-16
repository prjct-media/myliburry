package com.myliburry.scanner.fibonacci;

import java.util.Scanner;

import com.myliburry.scanner.screens.Screen;

// Monday October 10th, 2018

public class FibonacciRecursionScreen implements Screen {
	public Screen start() {
		System.out.println("Fibonacci Recursion");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the value of n: ");

		int n = scan.nextInt();
		System.out.println("n to the " + n);
		for (int i = 0; i <= n; i++) {
			System.out.println(fibonacciFunc(i) + " ");
		}
		fibonacciFunc(n);

		System.out.println("Returning.");
		return this;
	}

	public static int fibonacciFunc(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacciFunc(n - 1) + fibonacciFunc(n - 2);
		}
	}
}
