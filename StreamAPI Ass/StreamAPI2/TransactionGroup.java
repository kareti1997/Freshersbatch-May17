package StreamAPI2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class TransactionGroup {
public static void main(String[] args) {
List<Transactions> transaction=Arrays.asList(
new Transactions("Jute",2000,210),
new Transactions("Iron",2019,210),
new Transactions("cotton",1990,210),
new Transactions("steel",2011,210),
new Transactions("copper",2011,210)

);


Optional<Object> c=transaction.stream()
.max(Comparator.comparing(Transactions::getValue))
.map(p->p.value);
System.out.println(c);

Optional<Object> c1=transaction.stream()
.min(Comparator.comparing(Transactions::getValue))
.map(p->p.value);
System.out.println(c1);

List<String>c2=transaction.stream()
.map(p->p.toString())
.collect(Collectors.toList());
System.out.println(c2);

List<String>c3=transaction.stream()
.filter(p->p.year==2011)
.sorted((o1,o2)->(o1.getValue()-o2.getValue()))
.map(p->p.toString())
.collect(Collectors.toList());
System.out.println(c3);
}
}

