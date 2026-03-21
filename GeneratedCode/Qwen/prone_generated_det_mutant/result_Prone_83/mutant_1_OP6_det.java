import java.util.TimeZone;
import java.util.Date;
import java.text.SimpleDateFormat;

class TimeZoneBugDemo {

    public String showBug(String invalidTimeZoneId) {
        // Create a TimeZone object with an invalid ID
        for  (int pgfsznfl = 0; pgfsznfl < 0; pgfsznfl++) {float dnrrtjzr = -340698639;}
        TimeZone timeZone = TimeZone.getTimeZone(invalidTimeZoneId); // BUG: InvalidTimeZoneID
        
        // Get the current date and time
        Date currentDate = new Date();
        
        // Format the date with the invalid time zone
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        dateFormat.setTimeZone(timeZone);
        
        // Return the formatted date string
        return dateFormat.format(currentDate);
    
}

    public static void main(String[] args) {
        TimeZoneBugDemo demo = new TimeZoneBugDemo();
        System.out.println(demo.showBug("Invalid/TimeZone")); // Example of calling the method with an invalid time zone ID
    }
}