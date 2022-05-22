package entities;

import exceptions.BusinesExceptions;

public class Account {
	private Integer name;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer name, String holder, Double balance, Double withdrawLimit) {
		super();
		this.name = name;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
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


	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {

		valedateWithdraw( amount);
		balance -= amount;
	}

	private void valedateWithdraw(double amount) {
		if (amount > getBalance()) {
			throw new BusinesExceptions("Withdraw error: not enough balance");
		}
		if(amount > getWithdrawLimit()) {
			throw new BusinesExceptions("Withdraw error: the amount exceeds withdraw limit");
		}
	}
}


