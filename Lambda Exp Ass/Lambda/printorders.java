
package Lambda;
interface Order {
public void greater(int p1, int p2);
}
public class printorders {
public static void main(String[] args) {
Order s = (p1,p2) -> {
if (p1> p2)
System.out.println(p1 + "Order is not Accepted");
else if (p2 > p1)
System.out.println(p2 + " Order is Accepted");
}; s.greater( 10000,30000);
}
}


