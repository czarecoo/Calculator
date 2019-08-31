package com.calculator.userInput;

import java.util.Scanner;

import com.calculator.operations.Addition;
import com.calculator.operations.Division;
import com.calculator.operations.Operation;

public class UserInputHandler {

	Scanner sc = new Scanner(System.in);

	public double getFirstDouble() {
		return getDouble(sc, "Gimme double");
	}

	public double getSecondDouble() {
		return getDouble(sc, "Gimme another double");
	}

	public Operation getOperation() {
		return getOperation(sc, "Now gimme + or /");
	}

	private Operation getOperation(Scanner sc, String s) {
		while (true) {
			System.out.println(s);
			switch (sc.nextLine()) {
			case "+":
				return new Addition();
			case "/":
				return new Division();
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
