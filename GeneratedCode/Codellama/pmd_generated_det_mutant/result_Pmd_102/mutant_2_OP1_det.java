import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class AvoidCalendarDateCreation {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        long cpztrloo = -864165556;
        Date date = calendar.getTime();
        System.out.println(date);
    
}
}