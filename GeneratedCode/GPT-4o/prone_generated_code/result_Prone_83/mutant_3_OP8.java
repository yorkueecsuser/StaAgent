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
        String invalidId = "Invalid/TimeZone";
        String result = demo.showBug(invalidId);
        System.out.println("TimeZone ID returned: " + result); // Expected output is "GMT" due to the bug
    }
}

// Mutant Code: Renaming mutation applied
class MutantTimeZoneDemo {

    public String showBug(String z) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone a = TimeZone.getTimeZone(z); // BUG: InvalidTimeZoneID
        return a.getID();
    }

    public static void main(String[] args) {
        MutantTimeZoneDemo demo = new MutantTimeZoneDemo();
        
        // Demonstrating the bug with an invalid time zone ID
        String b = "Invalid/TimeZone";
        String c = demo.showBug(b);
        System.out.println("TimeZone ID returned: " + c); // Expected output is "GMT" due to the bug
    }
}