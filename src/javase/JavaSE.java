package javase;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * @author Marcos Gonzalez
 */
public class JavaSE {

    public static void main(String[] args) {
      
      // clase Data
      Date  fecha = new Date();
      int anio = fecha.getYear();
      int day = fecha.getDate();
      
      System.out.println(anio +  1900);
      
      System.out.println(day);
      
      //Calendar
        // metodo de clase es cuando accedes 
      Calendar calendario = Calendar.getInstance();
        int anio1 = calendario.get(Calendar.YEAR);
      
        System.out.println(anio1);
        
        // Calendiarop Gregoriano
        
        Calendar calendario1 = new GregorianCalendar();
        int anio2 = calendario1.get(Calendar.YEAR);
        
        System.out.println(anio2);
    }
    
}
