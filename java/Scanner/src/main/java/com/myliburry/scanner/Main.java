package com.myliburry.scanner;

import com.myliburry.scanner.screens.MainScreen;
import com.myliburry.scanner.screens.Screen;

public class Main {

	public static void main(String[] args) {
		
		
		Screen currentScreen = new MainScreen();
		
		while(true) {
			currentScreen = currentScreen.start();
		}
	}

}
