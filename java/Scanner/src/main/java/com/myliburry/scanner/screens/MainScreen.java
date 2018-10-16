package com.myliburry.scanner.screens;

import java.util.Scanner;

import com.myliburry.scanner.fibonacci.FibonacciIterationScreen;
import com.myliburry.scanner.fibonacci.FibonacciRecursionScreen;

// Landing Screen

// Monday October 10th, 2018

public class MainScreen implements Screen{


	public Screen start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("Welcome to the Scanner!");
		System.out.println("===========================");
		System.out.println("1. for OtherScreen.");
		System.out.println("2. for simple iteration of a Fibonacci.");
		System.out.println("3. for recursively iterating Fibonacci.");
		System.out.println("4. for Logout.");
		System.out.println("===========================");
		int options = scan.nextInt();
		switch (options) {
		case 1: return new OtherScreen();

		case 2: return new FibonacciIterationScreen();
		case 3: return new FibonacciRecursionScreen();
		
		case 4: logout();
		break;
		}

		return null;
	}

	public void logout() {
		
		System.out.println("Logging out!");
		System.exit(1);
	}
}
