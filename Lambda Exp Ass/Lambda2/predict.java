package Lambda2;

import java.util.function.Predicate;

public class predict {
	public static void main(String[] args) {
	      Predicate<Integer> predict=(t) -> {
	    	  
	    	  if(t%2==0)
	    	  {
	    		  return true;
	    	  }
	    	  else
	    	  {
	    		  return false;
	    	  }
	      
		};
		System.out.println(predict.test(10));

	}

}