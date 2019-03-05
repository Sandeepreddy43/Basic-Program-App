package com.regnant;

import java.util.Scanner;

public class TheatreApp {
	String TName;
	int Tcost;
	String[] MList;
	String Userid;
	String Pw;
	long mno;
	double totbill;
	Scanner S = new Scanner(System.in);

	public boolean CheckLogin(String Uid, String Paw) {
		if ((Uid.equalsIgnoreCase(Userid)) && (Paw.equalsIgnoreCase(Pw))) {
			System.out.println("Login Succcessful");
			SearchMovie(Uid, Paw);
			return true;
		} else {
			System.out.println("Login Failed & You are not able to book Ticket. Pls contact Customer Help Desk ");
			return false;

		}
	}

	public void SearchMovie(String Uid, String Paw) {
		System.out.println("Enter Movie Name: ");
		String Mov = S.nextLine();
		int eq = 0;
		for (int i = 0; i < MList.length; i++) {
			if (MList[i].equalsIgnoreCase(Mov)) {
				eq++;
				break;
			} else
				continue;
		}
		if (eq == 1) {
			CalBill(Uid, Paw);
		} else
			System.out.println("Movie not Found..!\nThanks for choosing our App");

	}

	public int Showtime(String Uid, String Paw) {
		System.out.println("How many Tickets U want..?");
		int reqqty = S.nextInt();
		return reqqty;

	}

	public void CalBill(String Uid, String Paw) {
		int reqqty = Showtime(Uid, Paw);
		totbill = reqqty * Tcost;
		PaymentCondition(Uid, Paw);
	}

	public double FinalBill(String Uid, String Paw) {
		double finbill = totbill;
		MovieAudian ma = new MovieAudian(Uid, Paw);
		ma.Pay = totbill;
		return finbill;
	}

	public void PaymentCondition(String Uid, String Paw) {
		FinalBill(Uid, Paw);
		MovieAudian ma = new MovieAudian(Uid, Paw);
		double payrec = ma.Payment(Uid, Paw);
		if (payrec >= totbill)
			System.out.println("Payment Successful...!\nTicket Details will be sent in 10 min to your reg. Mobile..!");
		else
			System.out.println("Payment not done..");
	}

}