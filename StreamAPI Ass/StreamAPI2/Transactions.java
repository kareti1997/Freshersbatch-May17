package StreamAPI2;


public class Transactions{
String Trader;
int year;
int value;
public Transactions(String Trader,int year,int value)
{
this.Trader=Trader;
this.year=year;
this.value=value;
}
public String getTrader() {
return Trader;
}
public void setTrader(String trader) {
Trader = trader;
}
public int getYear() {
return year;
}
public void setYear(int year) {
this.year = year;
}
public int getValue() {
return value;
}
public void setValue(int value) {
this.value = value;
}
@Override
public String toString() {
return "Transaction [Trader=" + Trader + ", year=" + year + ", value=" + value + "]";
}}

