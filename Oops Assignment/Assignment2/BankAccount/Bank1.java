package BankAccount;

public class Bank1 {

	public static void main(String[] args) {



		CurrentAccount c=new CurrentAccount();

		SavingsAccount s=new SavingsAccount();

		c.deposite(500.00);

		s.deposite(500.00);

		doWithdrawl(c);

		doWithdrawl(s);



		}

		public static void doWithdrawl(Bank acc)

		{

		boolean result=acc.Withdraw(1000.00);

		if(result)

		{

		System.out.println("withdraw succeed");

		}else {

		System.out.println("withdraw fail");

		}



		}



		}
