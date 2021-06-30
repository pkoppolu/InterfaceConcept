package com.info.abs_interface;
public class PPDemo {
	public static void main(String[] args) {
		ProcessPayment pp = new ProcessPayment();
		pp.process(new Cheque());
		pp.process(new CreditCard());
		pp.process(new DebitCard());
		pp.process(new Gpay ());
	}
}
