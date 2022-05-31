package streamAPI4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TradersGroup {

	public static void main(String[] args) {
		List<Traders> traders = Arrays.asList(
				new Traders("jute","hyderabad"),
				new Traders("cotton","pune"),
				new Traders("textiles","bangalore"),
				new Traders("marble","indore"),
				new Traders("iron","delhi"),
			    new Traders("steel","chennai")
				);
		//all cities
		List<String> c1=traders.stream()
				.sorted((o1,o2) ->(o1.getCity().compareTo(o2.getCity())))
				.map(p->p.city)
				.collect(Collectors.toList());
		        System.out.println(c1);
		//all traders from pune
		        List<String> c2=traders.stream()
		        		.filter(p->p.getCity().equals("pune"))
						.map(p->p.toString())
						.collect(Collectors.toList());
				        System.out.println(c2);
//all traders with names sorted
				        List<String> c3=traders.stream()
								.sorted((o1,o2) ->(o1.getName().compareTo(o2.getName())))
								.map(p->p.toString())
								.collect(Collectors.toList());
						        System.out.println(c3);
				      //any trader in indore
						        List<String> c4=traders.stream()
						        		.filter(p->p.getCity().equals("indore"))
										.map(p->p.toString())
										.collect(Collectors.toList());
								        System.out.println(c4);
				        
		        

	}

}
