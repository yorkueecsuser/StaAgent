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
        String hvpfvqvt = "Invalid/TimeZone";
        String turtucqj = demo.showBug(hvpfvqvt);
        System.out.println("TimeZone ID returned: " + turtucqj); // Expected output is "GMT" due to the bug
    }
}