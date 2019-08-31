package com.calculator;

import java.util.HashMap;
import java.util.Map;

import com.calculator.exceptions.OperationException;
import com.calculator.operations.Addition;
import com.calculator.operations.Division;
import com.calculator.operations.Exponentiation;
import com.calculator.operations.Multiplication;
import com.calculator.operations.Operation;
import com.calculator.operations.Substraction;

public class Calculator {
	private double firstNumber;
	private double secondNumber;
	private Map<String, Operation> allowedOperations;

	public Calculator(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.allowedOperations = createAllowedOperationsHashMap();
	}

	private Map<String, Operation> createAllowedOperationsHashMap() {
		HashMap<String, Operation> allowedOperationsMap = new HashMap<>();
		allowedOperationsMap.put(Addition.SIGN, new Addition());
		allowedOperationsMap.put(Substraction.SIGN, new Substraction());
		allowedOperationsMap.put(Multiplication.SIGN, new Multiplication());
		allowedOperationsMap.put(Division.SIGN, new Division());
		allowedOperationsMap.put(Exponentiation.SIGN, new Exponentiation());
		return allowedOperationsMap;
	}

	double calculate(Operation operation) throws OperationException {
		return operation.apply(firstNumber, secondNumber);
	}

	public Map<String, Operation> getAllowedOperations() {
		return allowedOperations;
	}
}