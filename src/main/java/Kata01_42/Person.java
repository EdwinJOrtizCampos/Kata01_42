package Kata01_42;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final long milPerYear = 31536000000L;
    private String name;
    private Calendar birthDate;
    
   public Person(String name, Calendar birthDate){
       this.name = name;
       this.birthDate = birthDate;

   }

    public int getAge() {
        Calendar now = GregorianCalendar.getInstance();
        return (int) ((now.getTimeInMillis() - birthDate.getTimeInMillis()) / milPerYear);
        
    }
   
   
   
   public String getName(){
       return name;
   }
}

