package collection1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;




public class Main {
public static void main(String[] args) {
Map<Long,Contact> values=new TreeMap<Long,Contact>().descendingMap();
@SuppressWarnings("removal")
Long l1=new Long(986068888);
@SuppressWarnings("removal")
Long l2=new Long(986068839);
@SuppressWarnings("removal")
Long l3=new Long(986062949);

Contact c1=new Contact("abc","abc@gmail.com");
Contact c2=new Contact("xyz","xyz@gmail.com");
Contact c3=new Contact("pqr","pqr@gmail.com");

values.put(l1, c1);
values.put(l2, c2);
values.put(l3, c3);

Set<Entry<Long,Contact>> entrySet=values.entrySet();
for(Entry<Long,Contact>entry:entrySet)
{
System.out.println(entry.getKey());
System.out.println(entry.getValue());
System.out.println(entry.getKey()+"::"+entry.getValue());





}
}



}

