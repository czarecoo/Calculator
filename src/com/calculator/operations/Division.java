package com.calculator.operations;

import com.calculator.exceptions.DivisionByZeroException;

public class Division implements Operation {
	@Override
	public double apply(double a, double b) throws DivisionByZeroException {
		if (b == 0) {
			throw new DivisionByZeroException("Cannot divide by 0");
		}
		return a / b;
	}
}
