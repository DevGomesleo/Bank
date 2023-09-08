package br.com.bank.entities;

public class Account {

	
	private String name;
	private Integer numberAccount;
	private double amount;
	
	public Account(String name, Integer numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}
	public Account(String name, Integer numberAccount, double deposit) {
		this.name = name;
		this.numberAccount = numberAccount;
		deposit(deposit);//Option: Initial deposit 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumberAccount() {
		return numberAccount;
	}
	public Double getAmount() {
		return amount;
	}
	public void deposit(double deposit) {
		this.amount += deposit;
	}
	public void withdraw(double amount) {
		this.amount -= amount;
	}
	
	public String toString() {
		return String.format("\nNumber Account: %d\nHolder: %s\nAmount: $%.2f\n", numberAccount, name, amount);
	}
}