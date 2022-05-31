package ExceptionHandling3;

public class InsufficientBalanceException extends Exception {
public InsufficientBalanceException()
{
super();
}
public InsufficientBalanceException(String msg)
{
super(msg);
}
}

