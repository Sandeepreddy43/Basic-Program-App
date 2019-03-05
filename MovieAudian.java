package com.regnant;

class MovieAudian {
	String AName;
	String Userid;
	String Pw;
	long mno;
	String MoviName;
	String MailId;
	int amount;
	double Pay = 0;

	MovieAudian(String uid, String pasw) {
		Userid = uid;
		Pw = pasw;
	}

	public double Payment(String Uid, String Paw) {
		double Pay = (250 * 6);
		return Pay;
	}

}