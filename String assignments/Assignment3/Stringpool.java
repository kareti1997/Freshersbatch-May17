package Assignment3;

public class Stringpool {
	public static void main(String[] args) {

		String str= "Java String pool refers to collection of String which are stored in heap memory";

		String s1=str.toUpperCase();

		String s2=str.toLowerCase();

		//System.out.println("string in uppercase letters is:" +str);

		System.out.println("s1 is:" +s1);

		System.out.println("s2 is:" +s2);

		if(str.contains("collection"))

		{

		System.out.println("collection is in the string");

		}

		String s3=str.replace('a', '$');

		System.out.println("s3 is:" +s3);

		boolean s4=str.matches("Java String pool refers to collection of String which are stored in heap memory");

		System.out.println("s4 is:" +s4);



		}



		}