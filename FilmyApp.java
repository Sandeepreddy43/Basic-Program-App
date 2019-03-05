package com.regnant;

import java.util.Scanner;

public class FilmyApp {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		System.out.println("Enter User id: ");
		String Useid = S.nextLine();
		System.out.println("Enter Password: ");
		String Pawd = S.nextLine();
		MovieAudian MrS = new MovieAudian(Useid, Pawd);
		MrS.AName = "Audian#1";
		MrS.mno = 1234565757L;
		MrS.MailId = "mycinema.com";
		MrS.Userid = Useid;
		MrS.Pw = Pawd;
		TheatreApp Spi = new TheatreApp();
		Spi.TName = "Spi Cinema";
		Spi.Tcost = 250;
		String[] MovList = { "Passengers", "Avatar", "First Man", "Lucy" };
		Spi.MList = MovList;
		Spi.Userid = "movie";
		Spi.Pw = "619";
		Spi.CheckLogin(Useid, Pawd);
		S.close();
	}

}