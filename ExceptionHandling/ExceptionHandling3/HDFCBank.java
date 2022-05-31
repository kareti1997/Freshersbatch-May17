package ExceptionHandling3;


	public class HDFCBank 

	{

	private double balance;

	public void deposite(double amount) throws IllegalBankTransactionExpection

	{

	if(amount <= 0)

	{

	throw new IllegalBankTransactionExpection(amount + "is not valid");

	}

	balance = balance + amount;

	}

	public double withdraw(double amount) throws InsufficientBalanceException

	{

	if(balance < amount)

	{

	throw new InsufficientBalanceException("insufficient funds");

	}

	balance = balance - amount;

	return amount;

	}

	public void balanceEnquiry()

	{

	System.out.println("current balance = "+ balance);

	}

	}