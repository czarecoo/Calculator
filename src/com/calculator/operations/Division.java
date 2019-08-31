package com.calculator.operations;

import com.calculator.exceptions.DivisionByZeroException;

public class Division implements Operation {
	public static final String SIGN = "/";

	@Override
	public double apply(double a, double b) throws DivisionByZeroException {
		if (b == 0) {
			throw new DivisionByZeroException("Cannot divide by 0");
		}
		return a / b;
	}
}
