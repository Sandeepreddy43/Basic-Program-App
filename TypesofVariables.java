package com.regnant;

public class TypesofVariables {
	int x = 12;
	static int y = 20;

	public static void main(String args[]) {
		TypesofVariables v = new TypesofVariables();
		int a = v.x;
		int b = 43;
		System.out.println("Instance Variable " + a);
		System.out.println("Static Variable " + y);
		System.out.println("Local Variable " + b);
	}
}