package com.reg;

import java.util.Scanner;

public class StudentEngg {
	String name;
	int no;
	String Branch;
	int[] marksObt;
	final String[] sub = { "English", "Maths #1", "Maths #2", "Branch Related Sub" };

	StudentEngg(String sName, int rno, String bran) {
		name = sName;
		no = rno;
		Branch = bran;
	}

	Scanner Sca = new Scanner(System.in);

	public void getMarks() {
		marksObt = new int[sub.length];
		int tot = 0;
		for (int i = 0; i < sub.length; i++) {
			System.out.println("Enter " + sub[i] + " Marks of " + name + ": ");
			marksObt[i] = Sca.nextInt();
			tot = tot + marksObt[i];
		}
		System.out.println("Student Name: " + name + "\nId No: " + no + "\nBranch: " + Branch);
		for (int i = 0; i < sub.length; i++)
			System.out.println(sub[i] + ": " + marksObt[i]);
		System.out.println("Total Marks Obt: " + tot);
		int per = tot / sub.length;// Total marks Max =400
		System.out.println("Percentage '%': " + per);
		if (per >= 75)
			System.out.println("Grade: 'A'");
		else if (per >= 60 && per < 75)
			System.out.println("Grade: 'B'");
		else if (per >= 50 && per < 60)
			System.out.println("Grade: 'C'");
		else if (per >= 35 && per < 50)
			System.out.println("Grade: 'D'");
		else
			System.out.println("'Fail'");
	}
}