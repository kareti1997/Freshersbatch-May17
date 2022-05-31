package BankAccount;

public class Bank {

	private String name;

	protected double balance;

	public String getName()

	{

	return this.name;

	}



	public void setName(String name)

	{

	this.name=name;



	}

	public void deposite(double amount)

	{

	this.balance +=amount;

	}

	public boolean Withdraw(double amount)

	{

	if(balance>amount) {



	this.balance +=amount;

	return true;

	}

	else {

	return false;

	}

	}



	}
