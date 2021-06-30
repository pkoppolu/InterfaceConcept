package com.info.abs_interface;
interface Payment {
	public static final int a = 1000; // Interface Instances and constants
	public static final int b = 2000;
void payBill();  // by default it is public abstract void payBill() 
static void confirmationBill() { // Static method
	System.out.println("Bill has been payed");
}
}
interface ProcessingDemo extends Payment{ // Interface Inheritance
	default void processing() { // default method
		System.out.println("Payment mode has been processing");
	}
}
class CreditCard implements Payment{ // Implementing an interfaces
	public void payBill() { // when we override the default modifier will always be in Public
		
		System.out.println("Credit card: Paybill is called");
	}
}	
class DebitCard implements Payment,ProcessingDemo{ // Implementing multiple interfaces
	public void payBill() {
	System.out.println(Payment.a);
	System.out.println(Payment.b);
	System.out.println("Debit card: Paybill is called");
	}	
}
class Cheque implements Payment,ProcessingDemo{
	public void payBill() {
		System.out.println("Cheque: Paybill is called");
	}
}	
class Gpay implements Payment{
	public void payBill() {
    	System.out.println("Gpay: Paybill is called");
	}	
}
