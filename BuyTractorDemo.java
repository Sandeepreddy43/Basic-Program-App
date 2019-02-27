package com.regnant;

class Custo{
	String name;
	String Add;
	long mno;
	Company S=new Company();
	void CalltoComp() {
		System.out.println("Explain about Models....!");
	}
	public boolean IsSatisfied() {
		if(S.GiveQuote()<=950000)
			return true;
		return false;
	}
	public int PlaceOrder() {
		if(IsSatisfied()) {
		int reqqty=2;
		return reqqty;
		}else return 0;
	}
	public boolean CheckPaymentMode() {
		if(S.ReceiveOrder()>=950000)
			return true;
		else return false;
	}
	public int Payment() {
		int Price=960000, no=0;
		if(CheckPaymentMode())
			return Price;
		else return no;
	}
	
}
class Company{
	String make;
	String model;
	String yom;
	String Warranty;
	String add;
	
	public void ExplainModels() {
		String name="Old is Gold";
		String mil="Chek yourself";
		int rating=5;
		System.out.println("Make & Model: "+name+"\nMileage: "+mil+"\nRating: "+rating);
	}
	public double GiveQuote() {
		double Priceperunit=950000;
		return Priceperunit;
	}
	public double ReceiveOrder() {
		Custo C=new Custo();
		double qty=C.PlaceOrder();
		double calbill=qty*(GiveQuote());
		double dp=(calbill*(0.5));
		return dp;
	}
	public boolean CheckPayment() {
		Custo C=new Custo();
		double dp=ReceiveOrder();
		int payfromcus=C.Payment();
		if(payfromcus>=dp)
			return true;
		else return false;
	}
	void DeliverStatus() {
		if(CheckPayment())
			System.out.println("\nOrder Accepted & Will be delivered to you by 30'Feb-2019");
		else System.out.println("Please go to another Company");
	}
		
}
public class BuyTractorDemo {

	public static void main(String[] args) {
		Custo Cs=new Custo();
		String nam=Cs.name="Aparichitudu";
		long pno=Cs.mno=108100104;
		String add=Cs.Add="Beside Ramanujan's house";
		System.out.println("Customer Details:");
		System.out.println("Name: "+nam);
		System.out.println("Mobile No: "+pno);
		System.out.println("Address: "+add);
		Company Cy=new Company();
		String cn=Cy.make="So&So";
		String cm=Cy.model="Different";
		String cw=Cy.Warranty="War & Tea";
		String ca=Cy.add="Search";
		System.out.println("\nCompany Details: ");
		System.out.println("Name: "+cn);
		System.out.println("Model: "+cm);
		System.out.println("Warranty: "+cw);
		System.out.println("Address: "+ca+"\n");
		Cs.CalltoComp();
		Cy.ExplainModels();
		Cy.DeliverStatus();

	}

}
