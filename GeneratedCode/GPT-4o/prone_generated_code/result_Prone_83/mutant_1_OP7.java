import java.util.TimeZone;

class TimeZoneDemo {

    public String showBug(String timeZoneId) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        return timeZone.getID();
    }
    
    // Method to generate a runtime condition
    private boolean isLoopConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        TimeZoneDemo demo = new TimeZoneDemo();
        
        // Unreachable while loop due to runtime condition being always false
        boolean conditionWhile = demo.isLoopConditionFalse();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("This is an unreachable loop.");
        }
        
        // Demonstrating the bug with an invalid time zone ID
        String invalidId = "Invalid/TimeZone";
        String result = demo.showBug(invalidId);
        System.out.println("TimeZone ID returned: " + result); // Expected output is "GMT" due to the bug
    }
}