package com.calculator.operations;

import com.calculator.exceptions.OperationException;

public interface Operation {
	abstract double apply(double firstNumber, double secondNumber) throws OperationException;
}
