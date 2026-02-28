import java.util.TimeZone;

class TimeZoneDemo {
    
    // Method to simulate a condition that is always false
    private boolean alwaysFalseCondition() {
        return System.currentTimeMillis() < 0; // This condition will always be false
    }

    public String showBug(String timeZoneId) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        
        // Inserting an unreachable if-else statement
        if (alwaysFalseCondition()) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Continuing with time zone processing.");
        }
        
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