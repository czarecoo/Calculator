package com.calculator.operations;

public class Multiplication implements Operation {
	public static final String SIGN = "*";

	@Override
	public double apply(double a, double b) {
		return a * b;
	}
}
