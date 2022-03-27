//printing current date and time
import java.util.*;
import java.time.*;
public class DateTime {
    public static void main(String[] args){
        Date date_Time=new Date();
        System.out.println("Current date and time:"+date_Time);
        System.out.println("Current date and time:"+LocalDateTime.now());
        System.out.println("Current date:"+LocalDate.now());
        System.out.println("Current time:"+LocalTime.now());
    }
}
