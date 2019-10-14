package org.bank;

public class BankInfo extends AxisBank {
	
	public void saving() {
		
		System.out.println("Axis Bank gives customer a good savings percentage");

	}
	public void fixed() {
	
	System.out.println("Axis Bank gives customer a good fixed interest rates");

}
    public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}

}
