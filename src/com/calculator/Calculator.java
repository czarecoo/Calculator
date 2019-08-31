package com.calculator;

import com.calculator.exceptions.DivisionByZeroException;
import com.calculator.operations.Operation;

public class Calculator {
	private double firstNumber;
	private double secondNumber;

	public Calculator(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	double calculate(Operation operation) throws DivisionByZeroException {
		return operation.apply(firstNumber, secondNumber);
	}
}