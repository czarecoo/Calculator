package com.calculator.exceptions;

public class DivisionByZeroException extends OperationException {
	public DivisionByZeroException(String msg) {
		super(msg);
	}
}