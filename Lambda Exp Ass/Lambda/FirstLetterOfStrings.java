package Lambda;

import java.util.Arrays; 
import java.util.Objects; 
import java.util.stream.Collectors; 
public class FirstLetterOfStrings {

	public static void main(String[] args) {
		 String[] strArray = { "Icecream", "Mango", "Blueberry", "Lichi", "Grapes" }; 
	        System.out.println(Arrays.stream(strArray) 
	                .filter(Objects::nonNull) 
	                .map(s->s.charAt(0)) 
	                .collect(Collectors.toList())); 
		

	}

}