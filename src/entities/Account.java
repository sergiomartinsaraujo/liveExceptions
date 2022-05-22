package entities;

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
		 balance -= amount;
	 }
	
	 public String valedateWithdraw(double amount) {
	 if (amount > getBalance()) {
			return "Withdraw error: not enough balance";
		}
		else if(amount > getWithdrawLimit()) {
			return "Withdraw error: the amount exceeds withdraw limit";
			
		}
	 return null;
	 }
}
