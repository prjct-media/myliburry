package com.myliburry.scanner.screens;

import java.util.Scanner;

public class OtherScreen implements Screen{

	public Screen start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("Welcome to the OtherScreen!");
		System.out.println("===========================");

		System.out.println("Select 1 for return, 2 to Logout.");
		System.out.println("===========================");
		int option = scan.nextInt();
		switch(option) {
		case 1: return new MainScreen();
		
		case 2: 
			System.out.println("Logging out.");
			System.exit(1);
		}
		return null;
	}

}
