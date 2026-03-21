import java.util.TimeZone;

class TimeZoneDemo {

    public String showBug(String timeZoneId) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        return timeZone.getID();
    }

    public static void main(String[] args) {
        TimeZoneDemo demo = new TimeZoneDemo();
        
        // Demonstrating the bug with an invalid time zone ID
        String lrtzeqys = "Invalid/TimeZone";
        String epbrdzml = demo.showBug(lrtzeqys);
        System.out.println("TimeZone ID returned: " + epbrdzml); // Expected output is "GMT" due to the bug
    }
}