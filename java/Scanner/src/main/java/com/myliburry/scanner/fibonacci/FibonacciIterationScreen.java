package com.myliburry.scanner.fibonacci;

import java.util.Scanner;

import com.myliburry.scanner.screens.Screen;

public class FibonacciIterationScreen implements Screen{

	// this is a fibonacci method when you are using iteration.
	
	// Monday October 10th, 2018
	
	public Screen start() {
		System.out.println("Fibonacci Iteration");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");

		int n = scan.nextInt();
		System.out.println("n to the " + n);
		fibonacciFunc(n);
		
		System.out.println("Returning.");
		return this;
	}
public static void fibonacciFunc(int n) {
	if (n == 0) {
		System.out.println("0");
	}
	else if (n == 1) {
		System.out.println("1");
	}
	else {
		System.out.println("0 1 ");
		int a = 0;
		int b = 1;
		for (int i = 1; i < n ; i++) {
			int nextNum = a + b;
			a = b;
			b = nextNum;
			System.out.println("Index is..." + i);
			System.out.println("number is..." + nextNum + " ");
		}
	}
}
	
	
}
