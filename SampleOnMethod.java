package com.regnant;

import java.util.Arrays;

public class SampleOnMethod {
	public static String[] m1 (int[] ar) {
		int len = ar.length/2;
		Arrays.sort(ar);

		int[] ar1 = Arrays.copyOf(ar, len);
		String s = Arrays.toString(ar1);
		
		int[] ar2 = Arrays.copyOfRange(ar, len, ar.length);
		String s1 = Arrays.toString(ar2);
		
		String[] obj= new String[2];
		obj[0] = s;
		obj[1] = s1;
		
		for(int i : ar1) {
			System.out.print(i+" ");
		}
		return obj;

	}

	public static void main(String args[]) {
		int[] ar = {12,15,14,21,18,45,43,99};
		String[] s = m1(ar);
		System.out.println();
		System.out.println(Arrays.toString(s));
	}

}
