package com.regnant;

import java.util.Scanner;

class UserLogin {
	String Usid;
	String pw;
	long mobileno;
	UserSignup sign = new UserSignup();

	public boolean CheckLogin(String Uid, String Pw) {
		if ((Uid.equalsIgnoreCase(Usid)) && (Pw.equalsIgnoreCase(pw))) {
			System.out.println("Login Succcessful & Go for Shopping");
			return true;
		} else {
			CheckMobileNum(mobileno);
			return true;

		}
	}

	public boolean CheckMobileNum(long mob) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter Mobile No: ******5757");
		mob = m.nextLong();
		if (mob == mobileno) {
			System.out.println("OTP Sended..!\nVerification Successful\nYour Username is 'JAVA'\nSet Password");
			System.out.println("Enter new Password:");
			String npw = m.next();
			if (npw.equals(pw))
				System.out.println("Login Succcessful & Go for Shopping");
			return true;
		} else {
			System.out.println("Mobile No not Exist & Go to Signup");
			sign.CheckIsExist();
			return false;
		}
	}
}

class UserSignup {
	String Username;
	String Eid;
	String pwd;
	long mobilenum;

	public boolean CheckIsExist() {
		Scanner u = new Scanner(System.in);
		System.out.println("Enter Mail Id: ");
		String Emailid = u.next();
		System.out.println("Enter Mobile No: ");
		long mobno = u.nextLong();
		if (Eid.equals(Emailid) || mobilenum == mobno) {
			System.out.println("Details already Exist & Go to login page...\nContact Help Centre");
			return true;
		} else {
			System.out.println("Enter Name: ");
			String name = u.next();
			System.out.println("Set Password: ");
			String pw = u.next();
			System.out.println("Usename: " + name + "\nPassword: **" + pw + "**\nLogin Succcessful & Go for Shopping");
			return false;
		}
	}
}

public class AppLogin {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter User id: ");
		String Userid = S.next();
		System.out.println("Enter Password: ");
		String Passw = S.next();
		UserLogin U = new UserLogin();
		U.Usid = "JAVA";
		U.pw = "123456";
		U.mobileno = 9849395757L;
		UserSignup Us = new UserSignup();
		Us.Eid = "123@abc.com";
		Us.mobilenum = U.mobileno;
		Us.Username = U.Usid;
		Us.pwd = U.pw;
		U.sign.Eid=Us.Eid;
		U.sign.mobilenum=U.mobileno;
		U.sign.pwd=U.pw;
		U.CheckLogin(Userid, Passw);
		// Us.CheckIsExist();

	}

}
