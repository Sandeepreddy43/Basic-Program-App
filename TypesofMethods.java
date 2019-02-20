package com.regnant;

public class TypesofMethods {

	public static void display() {
		System.out.println("Method Without Input & Output");
	}

	public static void displayreqmsg(String s) {
		System.out.println(s);
	}

	public static int calbill(int a, int b, int c) {
		int d = (a * b) + c;
		return d;
	}

	public static String addint() {
		int i = 2;
		String ad = "Method without Input & With return " + i;
		return ad;
	}

	public static void main(String[] args) {
		display();
		displayreqmsg("Method with Input & No return");
		int i = calbill(5, 6, 4);
		int z = calbill(15, 6, 4);
		System.out.println("Method with both Input & Output " + i);
		System.out.println(z);
		String s = addint();
		System.out.println(s);

	}

}