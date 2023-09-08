package br.com.bank.entities;

public class Account {

	
	private String name;
	private Integer numberAccount;
	private Double amount;
	
	public Account(String name, Integer numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}
	public Account(String name, Integer numberAccount, Double amount) {
		this.name = name;
		this.numberAccount = numberAccount;
		deposit(amount);//Option: Initial deposit 
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
	public void deposit(Double amount) {
		this.amount += amount;
	}
	public void withdraw(Double amount) {
		this.amount -= amount;
	}
	
	public String toString() {
		return String.format("%d, %s, $%.2f\n", numberAccount, name, amount);
	}
}