package Assignment;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		int sub1,sub2,sub3,totalmarks;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter subject1 markes");
		sub1=s.nextInt();
		System.out.println("Enter subject2 markes");
		sub2=s.nextInt();
		System.out.println("Enter subject3 markes");
		sub3=s.nextInt();
		totalmarks = sub1+sub2+sub3;
		if((sub1>=60)&&(sub2>=60)&&(sub3>=60))
		{
		System.out.println("passed");
		}
		else if(((sub1>=60)&&(sub2>=60))||((sub1>=60)&&(sub3>=60))||((sub2>=60)&&(sub3>=60)))
		{
		System.out.println("promoted");
		}
		// else if((((sub1>=60)&&((sub2<60)&&(sub3<60)))||
		// ((sub2>=60)&&((sub3<60)&&(sub1<60))) ||
		// ((sub3>=60)&&((sub2<60)&&(sub1<60)))||
		// ((sub1<60)&&((sub2<60)&&(sub3<60)))))
		else
		{
		System.out.println("failed");
		}
		}
		}


	}

