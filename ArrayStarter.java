package com.regnant;

import java.util.Arrays;

class ArrayDemoStarter {
	

	public static void PrintElements(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void PrintEvenandOdd(int[] a) {
		System.out.print("\nEven No's in Array: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) 
			System.out.print(a[i]+" ");	
		}
		System.out.print("\nOdd No's in Array: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) 
			System.out.print(a[i]+" ");
		}
	}
	public static void PrintEvenOddIndex(int[] a) {
		System.out.print("\nEven Index Elements in Array: ");
		for(int i=2;i<a.length;i+=2) 
			System.out.print(a[i]+" ");	
		
		System.out.print("\nOdd Index Elements in Array: ");
		for(int i=1;i<a.length;i+=2) {
			System.out.print(a[i]+" ");
		}
	}
	public static void printfromleftandrightrespec(char[] c)
	{
		System.out.println("\n\nGiven Array: "+Arrays.toString(c));
		int l=c.length;
		if(l%2!=0)
		{
		System.out.print("Centered Element: "+c[(l/2)]);
		System.out.print("\nLeft Side Elements: ");
		for(int i=0;i<(l/2);i++)
			System.out.print(c[i]+" ");
		System.out.print("\nRight Side Elements: ");
		for(int i=((l/2)+1);i<l;i++)
			System.out.print(c[i]+" ");
		}
		else
		{
			System.out.print("\nLeft Side Elements: ");
			for(int i=0;i<(l/2);i++)
				System.out.print(c[i]+" ");
			System.out.print("\nRight Side Elements: ");
			for(int i=(l/2);i<l;i++)
				System.out.print(c[i]+" ");
		}
	}
	public static void PrintAlterEleinArr(char[] c) {
		System.out.print("\nAlternate Elements: ");
		for(int i=0;i<c.length;i+=2)
			System.out.print(c[i]+" ");
	}
	public static int FindIndexOfCharinArr(char[] c, char ch) {
		int i=new String(c).indexOf(ch);
		return i;
	}
	public static void CalSumandAvgofArr(int[] a) {
		int sum=0,avg;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("\n\nSum: "+sum);
		System.out.println("Average: "+avg);
	}
}	
public class ArrayStarter {
		
	public static void main(String[] args) {
		int[] arr= {12,13,23,24,36,48,49,59,60};
		char[] ch= {'W','E','L','C','O','M','E'};
		ArrayDemoStarter.PrintElements(arr);
		ArrayDemoStarter.PrintEvenandOdd(arr);
		ArrayDemoStarter.PrintEvenOddIndex(arr);
		ArrayDemoStarter.printfromleftandrightrespec(ch);
		ArrayDemoStarter.PrintAlterEleinArr(ch);
		ArrayDemoStarter.CalSumandAvgofArr(arr);
	}

}
