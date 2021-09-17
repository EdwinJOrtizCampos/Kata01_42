package Kata01_42;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;
    
   public Person(String name, LocalDate birthDate){
       this.name = name;
       this.birthDate = birthDate;

   }

    public int getAge() {
        LocalDate now = LocalDate.now();
        return Period.between(birthDate, now).getYears();
        
    }
   
   
   
   public String getName(){
       return name;
   }
}

