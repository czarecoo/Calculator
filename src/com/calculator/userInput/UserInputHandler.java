package com.calculator.userinput;

import java.util.Map;
import java.util.Scanner;

import com.calculator.operations.Operation;

public class UserInputHandler {
	Scanner sc;

	public UserInputHandler() {
		sc = new Scanner(System.in);
	}

	public double getFirstDouble() {
		return getDouble(sc, "Gimme double");
	}

	public double getSecondDouble() {
		return getDouble(sc, "Gimme another double");
	}

	public Operation getOperation(Map<String, Operation> allowedOperations) {
		while (true) {
			System.out.println("Now gimme one of those: " + allowedOperations.keySet());
			String userInput = sc.nextLine();
			if (allowedOperations.containsKey(userInput)) {
				return allowedOperations.get(userInput);
			}
		}
	}

	private double getDouble(Scanner sc, String s) {
		while (true) {
			try {
				System.out.println(s);
				return Double.parseDouble(sc.nextLine());
			} catch (NumberFormatException e) {
			}
		}
	}
}
