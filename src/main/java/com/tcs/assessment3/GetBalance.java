package com.tcs.assessment3;

import java.io.IOException;


public class GetBalance {
	
	public static void main(String args[])throws IOException{
		
		BankAccount ba = new BankAccount();
		
		System.out.println("Amount is:");
		ba.deposit(2000);
		ba.withdrawal(100);
	}

}
