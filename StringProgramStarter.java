package com.regnant;

import java.util.Arrays;

class DemoOnString {
	public static int CountwWordsinString(String S) {
		int count = 1;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == ' ' && S.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count;
	}

	public static String RemoveWhiteSpace(String S) {
		String R = S.replace(" ", "");
		return R;
	}

	public static int CovertionOfStringtoInt(String S) {
		int i = Integer.parseInt(S);
		return i;
	}

	public static String ConvertionOfInttoString(int i) {
		String s = Integer.toString(i);
		return s;
	}

	public static int[] CountVowelsandConsonants(String S) {
		int v = 0, c = 0, oth = 0;
		S = S.toLowerCase();
		System.out.println("String in Lower Case: " + S);
		char[] ch = S.toCharArray();

		for (int i = 0; i < S.length(); i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				++v;
			} else if (ch[i] > 'a' && ch[i] < 'z') {
				++c;
			} else
				++oth;
		}
		int[] count = new int[3];
		count[0] = v;
		count[1] = c;
		count[2] = oth;
		System.out.println("Vowels: " + v);
		System.out.println("Consonants: " + c);
		System.out.println("Other Characters: " + oth);
		return count;
	}

	public static boolean CheckPalindrome(String S) {
		char[] c = S.toCharArray();
		if (c.length % 2 == 0) {
			for (int i = 0, j = (S.length() - 1); i < S.length() & j >= (S.length() / 2); i++, j--) {
				if (c[i] == c[j])
					return true;
			}
			return false;
		} else {
			for (int i = 0, j = (S.length() - 1); i < S.length() & j > (S.length() / 2); i++, j--) {
				if (c[i] == c[j])
					return true;
			}
			return false;
		}
	}

	public static StringBuilder ReverseOfString(String S) {
		StringBuilder SB = new StringBuilder(S);
		SB.reverse();
		return SB;
	}

	public static void SwapString() {
		String j = "January";
		String f = "February";
		System.out.println("Before Swapping 'j'= " + j + " 'f'=" + f);
		j = j + f;
		f = j.substring(0, j.length() - f.length());
		j = j.substring(f.length());
		System.out.println("After Swapping 'j'= " + j + " 'f'=" + f);
	}
}

class FindDupCharinString {
	public static void FindDupCharinStr(String S) {
		S = S.toUpperCase();
		System.out.println("String in Upper Case: " + S);
		char[] charAr = S.toCharArray();
		Arrays.sort(charAr);
		for (int i = 1; i < charAr.length;) {
			int count = CheckRecursive(charAr, i, 1);
			if (count > 1) {
				System.out.println("'" + charAr[i] + "' comes " + count + " times");
				i = i + count;
			} else
				i++;
		}
	}

	public static int CheckRecursive(char[] charAr, int i, int count) {
		if (ifEquals(charAr[i - 1], charAr[i])) {
			count = count + CheckRecursive(charAr, ++i, count);
		}
		return count;
	}

	public static boolean ifEquals(char a, char b) {
		return a == b;
	}
}

public class StringProgramStarter {

	public static void main(String[] args) {
		String Test = "emo Program on Strings of Multi Checking";
		String Val = "2019";
		String pal = "Sahas";
		int in = 20022019;
		StringBuilder rev;
		int i = DemoOnString.CountwWordsinString(Test);
		System.out.println("String Given: \n" + Test);
		System.out.println("Total No of Words in Given String : " + i);
		String Re = DemoOnString.RemoveWhiteSpace(Test);
		System.out.println(Re);
		int j = DemoOnString.CovertionOfStringtoInt(Val);
		System.out.println("Conversion of String to int : " + j);
		String con = DemoOnString.ConvertionOfInttoString(in);
		System.out.println("Conversion of int to String : " + con);
		DemoOnString.CountVowelsandConsonants(Test);
		if (DemoOnString.CheckPalindrome(pal)) {
			System.out.println(pal + " is Palindrome");
		} else {
			System.out.println(pal + " is not a Palindrome");
		}
		rev = DemoOnString.ReverseOfString(Test);
		System.out.println("Reverse of String: " + rev);
		DemoOnString.SwapString();
		FindDupCharinString.FindDupCharinStr(Test);
	}
}