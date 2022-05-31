package Lambda;

@FunctionalInterface
interface Arithmatic
{
int operation(int a,int b);
}
public class LambdaExpressions {
public static void main(String[] args)
{
Arithmatic addition=(a,b)->(a+b);
System.out.println("Addition=>"+addition.operation(20, 10));
Arithmatic substraction=(a,b)->(a-b);
System.out.println("Substraction=>"+substraction.operation(20, 10));
Arithmatic multiplication=(a,b)->(a*b);
System.out.println("multiplication=>"+multiplication.operation(20, 10));
Arithmatic Division=(a,b)->(a/b);
System.out.println("Division=>"+Division.operation(20, 10)); }}

