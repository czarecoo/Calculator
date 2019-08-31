package com.calculator.operations;

public class Exponentiation implements Operation {
	public static final String SIGN = "^";

	@Override
	public double apply(double a, double b) {
		return Math.pow(a, b);
	}
}
