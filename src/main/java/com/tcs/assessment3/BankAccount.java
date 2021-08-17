package com.tcs.assessment3;

import java.util.Date;

public class BankAccount {

	private String ownerName;
	private double balanceAmount;
	private Date createdDate;
	private STATUS status;
	private String address;
//	private String city; 
//	private String state; 
//	private int pin;
//	private int phoneNumber; 
//	private String houseNumber; 
//	private String street;
	
	public String getOwnerName() {
		return ownerName;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public STATUS getStatus() {
		return status;
	}
	
	public String getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "BankAccount [ownerName=" + ownerName + ", balanceAmount=" + balanceAmount + ", createdDate="
				+ createdDate + ", status=" + status + ", address=" + address + "]";
	}

	public double getBalance() {
		return balanceAmount;
	}
	
	public void deposit(double depositAmount) {
	
		    if (depositAmount > 0) 
		    System.out.println(balanceAmount = balanceAmount + depositAmount); 
	}
	
	public void withdrawal(double withdrawAmount) {
        
        if (balanceAmount >= withdrawAmount) {
            System.out.println(balanceAmount = balanceAmount - withdrawAmount);
        } 
        else {
            System.out.println("Insufficient Balance.Transaction Failed.");
        }
    }

}




