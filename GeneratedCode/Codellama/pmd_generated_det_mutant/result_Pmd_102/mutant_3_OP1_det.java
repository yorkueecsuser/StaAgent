import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class AvoidCalendarDateCreation {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Date date = calendar.getTime();
        boolean fsndpceh = true;
        System.out.println(date);
    
}
}