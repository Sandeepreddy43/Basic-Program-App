package com.regnant;

class DemoOnLoops {
	public static void print1tonandnto1(int n) {
		System.out.println("Printing of 1 to " + n + " Order: ");
		for (int i = 0; i <= n; i++) {
			System.out.print(i + " ");
			;
		}
		System.out.println("\nPrinting of " + n + " to 1 Order: ");
		for (int i = n; i>= 0; i--) {
			System.out.print(i + " ");
			;
		}
	}

	public static void printevenandodd(int n) {
		System.out.println("\nEven Numbers  up to " + n);
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nOdd Numbers up to " + n);
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
	public static boolean CheckPrime(int n) {
		for(int j=2;j<=(n/2);j++) {
				if(n%j==0) {
					return false;
				}
			}return true;
	}
	public static void PrinAlternativenum(int n) {
		System.out.print("\nAlternate No's from 1 to "+n+" : ");
		for(int i=1;i<=n;i+=2) {
			System.out.print(i+" ");
			
		}
	}
	public static void Printnumdivby7(int n) {
		System.out.print("\nNo's Div by 7 in Range b/w 7 to "+n+" : ");
		for(int i=7;i<=n;i+=7) {
			System.out.print(i+" ");
		}
	}
}


public class LoopsDemo {

	public static void main(String[] args) {

		DemoOnLoops.print1tonandnto1(10);
		DemoOnLoops.printevenandodd(25);
		int rangeforprime=100;
		System.out.print("\nPrime No's b/w Range 2 to "+rangeforprime+" : ");
		for(int i=2;i<=rangeforprime;i++)
		{
			if(DemoOnLoops.CheckPrime(i))
			{
				System.out.print(i+" ");
			}
		
		}
		DemoOnLoops.PrinAlternativenum(25);
		DemoOnLoops.Printnumdivby7(143);
	}
}
