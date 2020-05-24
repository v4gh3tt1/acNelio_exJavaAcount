package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private double withDrawLimit;
	
	public Account(Integer number, String holder, Double balance, double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void withdraw (double amount) {
		if (amount > withDrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if (amount > balance ) {
			throw new DomainException("Not enought balance");
		}
		balance -=amount;
	}

	
}
