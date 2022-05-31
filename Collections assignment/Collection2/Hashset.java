package Collection2;

import java.util.HashSet;
import java.util.Iterator;




public class Hashset {
public static void main(String[] args) {
HashSet<String>hs=new HashSet<String>();
hs.add("India");
hs.add("America");
hs.add("Russia");
hs.add("India");
hs.add("Russia");



System.out.println("Set is" +hs);
Iterator it=hs.iterator();
System.out.println("element using iterator");
while(it.hasNext())
{
String s=(String)it.next();
System.out.println(s);
}
}




}