package collection4;



import java.util.ArrayList;
import java.util.List;
public class LinkedList { public static void main(String[] args) {
List<Date> l=new ArrayList<>();
Date d1=new Date(21,11,1997);
Date d2=new Date(18,3,1992);
Date d3=new Date(29,11,1994);
Date d4=new Date(23,12,2000);
l.add(d1);
l.add(d2);
l.add(d3);
l.add(d4);
for(Date d:l) {
System.out.println("\nDate: "+d.date+"-"+d.month+"-"+d.year);
System.out.println("Leap Year:"+d.leapYear());
}
}
}
class Date {
int date,month,year;
public Date(int date,int month,int year) {
this.date=date;
this.month=month;
this.year=year;
}
int getDate() {
return this.date;
}
int getMonth() {
return this.month;
}
int getYear() {
return this.year;
}
boolean leapYear() {
return ((this.year%4==0)&&(this.year%100!=0)||(this.year%400==0)) ;
} }

