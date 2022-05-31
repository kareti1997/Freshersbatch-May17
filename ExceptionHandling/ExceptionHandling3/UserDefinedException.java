package ExceptionHandling3;

public class UserDefinedException {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
	SavingAccount acct=new SavingAccount();
	System.out.println("current balance is:" +acct.balance());
	System.out.println("withdrawing $2100");
	acct.withdraw(2100);
	System.out.println("current balance is:" +acct.balance());
	acct.withdraw(2000);
	}
	}
	class SavingAccount{
	private double balance=2000;
	public double balance() {
	return balance;
	}
	public void withdraw(int amount)throws NotSufficientBalanceException{
	if(amount>balance)
	{
	throw new NotSufficientBalanceException(String.format("current balance % is less than requested amount %d",balance,amount));
	}
	balance=balance-amount;
	}
	public void deposit(int amount) {
	if(amount<=0) {
	throw new IllegalArgumentException(String.format("Invalid deposite amount %s",amount));
	}
	}
	}
	class NotSufficientBalanceException extends RuntimeException{
	private String message;
	public NotSufficientBalanceException(String message) {
	this.message=message;
	}
	public NotSufficientBalanceException(Throwable cause, String message) {
	super(cause);
	this.message=message;
	}
	public String getMessage()
	{
	return message;
	} }

