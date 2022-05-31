package Assignment;

public class Amstrong {

	public static void main(String[] args) {
	
		int i=100, arm;
		System.out.println("Amstrong numbers between 100 to 999");
		while(i<1000)
		{
		arm = armstrongOrNot(i);
		if(arm==i)
			System.out.println(i);
		    i++;
		}
	}
	static int armstrongOrNot(int num)
	{
		int X,a=0;
		while(num!=0)
		{
			X=num%10;
			a=a+(X*X*X);
			num/=10;
		}
		return a;
	}
}
			
   
         
