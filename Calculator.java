package com.regnant;

public class Calculator {

	public static void main(String[] args) {
		int c = add(12, 24);
		int d = sub(24, 12);
		int e = mul(6, 12);
		double f = div(80, 9);
		double g = mod(20, 9);
		String x = "Eclipse";
		String y = S2(x);
		System.out.println("Addition: " + c);
		System.out.println("Subtraction: " + d);
		System.out.println("Multiplication: " + e);
		System.out.println("Division: " + f);
		System.out.println("Modulation: " + g);
		System.out.println(y);
	}

	public static int add(int x, int y) {
		return (x + y);
	}

	public static int sub(int a, int b) {
		return (a - b);
	}

	public static int mul(int a, int b) {
		return (a * b);
	}

	public static double div(double a, double b) {
		return (a / b);
	}

	public static double mod(double a, double b) {
		return (a % b);
	}

	public static String S2(String a) {
		return a;
	}

}