package com.regnant;
class Customer{
	String name;
	long mno;
	String Add;
	public void CallResto() {
		String item= "MB";
		int ordqty=03;
		System.out.println("Ordered items: "+item+"  Order Qty: "+ordqty);
	}
	void isSatisfy() {
		Resto r=new Resto();
		int Amount=r.CalBill();
		if(Amount==500)
			System.out.println("Order Placed");
		System.out.println("Order Cancelled");
	}
	public int Paybill() {
		int amount=500;
		return amount;
	}
}
class Resto{
	String name;
	int mno;
	String Address;
	String menu;
	Customer c=new Customer(); 
	public void ReceiveOrder() {
	c.CallResto();
	}
	public int CalBill() {
		int Price=500;
		return Price;
	}
	public boolean Payment() {
		int billrec=c.Paybill();
		if(billrec==500)
		{ 
			System.out.println("Payment done");
			return true;
		}
		else { 
			System.out.println("Unable to order/ Not enough funds");
				return false;
		}
	}
	void Delivery()
	{
		if(Payment())
			System.out.println("Your Order Confirmed & Will be deliver to you in 40 min");
	}
}


public class OnlineOrderDemo {

	public static void main(String[] args) {
		Customer R=new Customer();
		R.name="Rohit Robin";
		R.mno=9533905875l;
		R.Add="Geetanjali Layout, Bangalore";
		//R.CallResto();
		//R.isSatisfy();
		R.Paybill();
		Resto H=new Resto();
		H.name="Hyd Biriyani";
		H.mno=565645;
		H.Address="Indira Nagar, Bangalore";
		H.menu= "MB";
		H.ReceiveOrder();
		//H.Payment();
		H.Delivery();

	}

}
