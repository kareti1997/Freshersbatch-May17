package ExpectionHandling1;

import java.util.Scanner;

public class ArithmeticExpections {



	public static void main(String[] args) {

	Scanner input =new Scanner(System.in);

	try

	{

	System.out.println("Enter first num");

	int n1=input.nextInt();

	System.out.println("Enter second num");

	int n2=input.nextInt();

	int sum=n1/n2;

	System.out.println(sum);



	}

	catch(ArithmeticException e)

	{

	System.out.println(e);

	}
	}
}