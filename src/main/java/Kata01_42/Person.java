package Kata01_42;
import java.util.Date;


public class Person {
    private String name;
    private Date birthDate;
    
   public Person(String name, Date birthDate){
       this.name = name;
       this.birthDate = birthDate;

   }

    public int getAge() {
        Date today = new Date();
        return today.getYear() - birthDate.getYear();
    }
   
   
   
   public String getName(){
       return name;
   }
}

