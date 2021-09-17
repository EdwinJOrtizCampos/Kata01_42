package Kata01_42;
import java.time.LocalDate;
public class Main {
    
    public static void main(String[] args){
        Person person;
        person = new Person("Pepe", LocalDate.of(1980, 1, 1));
        System.out.println(person.getName() + " tiene " + person.getAge()
                + " años.");
    }
    
}
        

