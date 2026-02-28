import java.util.TimeZone;

class TimeZoneDemo {

    public String showBug(String timeZoneId) {
        // Original code: Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        return timeZone.getID();
    }

    // Mutant Code
    public String showBugMutant(String a) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone b = TimeZone.getTimeZone(a); // BUG: InvalidTimeZoneID
        return b.getID();
    }

    public static void main(String[] args) {
        TimeZoneDemo demo = new TimeZoneDemo();
        
        // Demonstrating the bug with an invalid time zone ID
        String invalidId = "Invalid/TimeZone";
        String result = demo.showBug(invalidId);
        System.out.println("TimeZone ID returned: " + result); // Expected output is "GMT" due to the bug
        
        // Mutant demonstration
        String mutantResult = demo.showBugMutant(invalidId);
        System.out.println("Mutant TimeZone ID returned: " + mutantResult); // Expected output is "GMT" due to the bug
    }
}