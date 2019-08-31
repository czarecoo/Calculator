package com.calculator.operations;

import com.calculator.exceptions.DivisionByZeroException;

public interface Operation {
	double apply(double firstNumber, double secondNumber) throws DivisionByZeroException;
}
