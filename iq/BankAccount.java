package com.singtel.iq;

	
public class BankAccount {
	
	private String accountName;
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountName, String accountHolder, double balance) {
		super();
		this.accountName = accountName;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited: $"+amount);
			dislpayBalance();
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
	public void withdraw(double amount) {
		if(amount > 0 && amount <=balance) {
			balance -= amount;
			System.out.println("Withdrawn: $"+amount);
			dislpayBalance();
		}else {
			System.out.println("Invalid withdrawal amount or insufficient funds");
		}
	}
	void dislpayBalance() {
		// TODO Auto-generated method stub
		System.out.println("Current Balance: $"+balance);
	}
	

}
