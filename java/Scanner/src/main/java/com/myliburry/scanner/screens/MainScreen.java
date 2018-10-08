package com.myliburry.scanner.screens;

import java.util.Scanner;

// Landing Screen

public class MainScreen implements Screen{


	public Screen start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("Welcome to the Scanner!");
		System.out.println("===========================");
		System.out.println("Please input anything.");
		String input = scan.nextLine();
		System.out.println("You input..." + input);
		System.out.println("===========================");
		System.out.println("1. for OtherScreen.");
		System.out.println("2. for Logout.");
		System.out.println("===========================");
		int options = scan.nextInt();
		switch (options) {
		case 1: return new OtherScreen();

		case 2: logout();
		break;
		}

		return null;
	}

	public void logout() {
		
		System.out.println("Logging out!");
		System.exit(1);
	}
}
