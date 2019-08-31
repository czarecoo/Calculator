package com.calculator;

import com.calculator.exceptions.OperationException;
import com.calculator.operations.Operation;
import com.calculator.userinput.UserInputHandler;

public class Main {
	public static void main(String[] args) {
		UserInputHandler userHandler = new UserInputHandler();
		Calculator calculator = new Calculator(userHandler.getFirstDouble(), userHandler.getSecondDouble());
		Operation operation = userHandler.getOperation(calculator.getAllowedOperations());
		try {
			System.out.println(calculator.calculate(operation));
		} catch (OperationException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Thank you, bye.");
	}
}
