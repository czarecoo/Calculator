package com.calculator;

import com.calculator.exceptions.DivisionByZeroException;
import com.calculator.userInput.UserInputHandler;

public class Main {
	public static void main(String[] args) {
		UserInputHandler userHandler = new UserInputHandler();
		Calculator calculator = new Calculator(userHandler.getFirstDouble(), userHandler.getSecondDouble());
		calculate(userHandler, calculator);
	}

	private static void calculate(UserInputHandler userHandler, Calculator calculator) {
		try {
			System.out.println(calculator.calculate(userHandler.getOperation()));
		} catch (DivisionByZeroException e) {
			System.err.println(e.getMessage());
		}
	}
}
