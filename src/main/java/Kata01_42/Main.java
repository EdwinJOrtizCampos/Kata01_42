package Kata01_42;
import java.util.GregorianCalendar;

public class Main {
    
    public static void main(String[] args){
        Person person = new Person("Pepe", new GregorianCalendar(1980,1,1));
        System.out.println(person.getName() + " tiene " + person.getAge()
                + " años.");
    }
    
}
        

