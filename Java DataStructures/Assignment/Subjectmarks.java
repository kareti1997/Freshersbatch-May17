package Assignment;

import java.util.Scanner;

public class Subjectmarks {

	public static void main(String[] args) {
		int s1,s2,s3,sum;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the s1:");
		s1=in.nextInt();
		System.out.println("Enter the s2:");
		s2=in.nextInt();
		System.out.println("Enter the s3:");
		s3=in.nextInt();
		sum=s1+s2+s3;
		System.out.println("sum"+sum);
		if(sum>=60) {
		System.out.println("passed");
		}
		else if((s1+s2 >=60)||(s3+s2 >=60)||(s1+s3 >=60)) {
		System.out.println("promoted");
		}
		else {
		System.out.println("failed");
		}
		}

		}