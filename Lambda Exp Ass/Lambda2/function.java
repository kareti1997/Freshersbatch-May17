package Lambda2;

import java.util.function.Function;


public class function {
	public static void main(String[] args) {
	       Function<String,Integer> function=(t)->t.length();
	       System.out.println(function.apply("Hello word"));
		}


}
