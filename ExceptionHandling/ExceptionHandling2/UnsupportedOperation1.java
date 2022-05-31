package ExceptionHandling2;

import java.util.Scanner;

public class UnsupportedOperation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc=new Scanner(System.in))
		{
		System.out.println("enter thr first number");
		int i=sc.nextInt();
		System.out.println("enter thr second number");
		int j=sc.nextInt();
		try
		{
		int k=i/j;
		System.out.println("answer= " + k);
		}
		catch(ArithmeticException e)
		{
		throw new UnsupportedOperationException("zero cannot divide by any number");
		}
		// TODO Auto-generated method stub



		}
		}

		}