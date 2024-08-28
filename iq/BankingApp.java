package com.singtel.iq;

import java.util.Scanner;

public class BankingApp {
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount("12345678", "Sreekanth", 1000.0);
		
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter deposit amount: $");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter withdrawal amount: $");
				double withdrawalAmount = scanner.nextDouble();
				account.withdraw(withdrawalAmount);
				break;
			case 3:
				account.dislpayBalance();
				break;
			case 4:
				System.out.println("Exiting the program. Thank you!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");	
			}
		}while(choice !=0);
		scanner.close();
	}
}