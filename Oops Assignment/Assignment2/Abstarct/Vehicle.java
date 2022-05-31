package Abstarct;


public abstract class Vehicle {
abstract void start();
void display() {
System.out.println("display non abstract method");

}



}
class Car extends Vehicle
{
void start()
{
System.out.println("car start with key");
}
}
class Scooter extends Vehicle
{
void start()
{
System.out.println("scooter start with kick");
}
public static void main(String[]args) {
Scooter s=new Scooter();
s.start();
Car c=new Car();
c.start();
}
}