package br.com.bank.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.bank.entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account1;
		
		System.out.print("Enter number account: ");
		Integer accountNumber = input.nextInt();
		input.nextLine();//clear buffer
		
		System.out.print("Enter holder: ");
		String name = input.nextLine();
		
		System.out.print("Deposit [y/n]?: ");
		String choice = input.nextLine();
		
		// Initial deposit yes or no!
		
		if(choice.length() >= 1 && Character.toLowerCase(choice.charAt(0)) == 'y') { 
			
			System.out.print("Enter a initial deposit value $: ");
			double deposit = input.nextDouble();
			account1 = new Account(name,accountNumber, deposit);
			
		}else {
			
			account1 = new Account(name, accountNumber);
		}
		
		System.out.println(account1);
		

	}

}
