import java.util.TimeZone;
import java.util.Date;
import java.text.SimpleDateFormat;

class TimeZoneBugDemo {
public String showBug(String invalidTimeZoneId){
    TimeZone timeZone = TimeZone.getTimeZone(invalidTimeZoneId);
    Date currentDate = new Date();
    currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
    dateFormat.setTimeZone(timeZone);
    return dateFormat.format(currentDate);
}

    public static void main(String[] args) {
        TimeZoneBugDemo demo = new TimeZoneBugDemo();
        System.out.println(demo.showBug("Invalid/TimeZone")); // Example of calling the method with an invalid time zone ID
    }
}