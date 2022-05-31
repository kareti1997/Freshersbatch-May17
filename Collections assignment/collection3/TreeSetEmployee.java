package collection3;

import java.util.Set;
import java.util.TreeSet;public class TreeSetEmployee { public static void main(String[] args) {
Set<Employee> names=new TreeSet<Employee>();
Employee E3=new Employee(4,"divyapriya","divi@gmail.com",202000);
Employee E4=new Employee(3,"leela","lee@gmail.com",202000);
Employee E5=new Employee(8,"sarayu","sarayu@gmail.com",202000);
Employee E6=new Employee(9,"saanvi","saanvi@gmail.com",202000);
Employee E7=new Employee(2,"geetha","geeta@gmail.com",202000);
names.add(E3);
names.add(E5);
names.add(E6);
names.add(E7);
names.add(E4);
for(Employee name:names)
{
name.display();
} }
}

