package com.reg;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		String stuName;
		int rolno;
		String bran;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Class Strength: ");
		int totno = Sc.nextInt();
		StudentEngg[] St = new StudentEngg[totno];// Creating Constructor Array
		for (int i = 0; i < St.length; i++) {
			System.out.println("Enter name of #" + (i + 1) + " Student: ");
			if (i == 0) {
				Sc.nextLine();
			}
			stuName = Sc.nextLine();
			System.out.println("Enter Roll No. of #" + (i + 1) + " Student: ");
			rolno = Sc.nextInt();
			System.out.println("Enter Branch of #" + (i + 1) + " Student: ");
			Sc.nextLine();
			bran = Sc.nextLine();
			St[i] = new StudentEngg(stuName, rolno, bran);
			System.out.println(stuName + " " + rolno + " " + bran);
			Sc.nextLine();
		}
		for (int i = 0; i < totno; i++) {
			St[i].getMarks();
		}
		Sc.close();
	}
}