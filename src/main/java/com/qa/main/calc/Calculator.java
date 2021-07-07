package com.qa.main.calc;


public class Calculator {
	
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static double sub(double x, double y) {
		return x - y;
	}
	
	public static double mult(double x, double y) {
		return x * y;
	}
	
	public static double div(double x, double y) throws ArithmeticException {

		if (x == 0 || y == 0) {
			throw new ArithmeticException("Cannot div by 0");
		}else if (x < y){
			throw new ArithmeticException("Avoid dividing by a large number than " + x);
		}else {
			return x / y;
		}
	}
	
	public static double mod(double x, double y) {
		return x % y;
	}
		

}
