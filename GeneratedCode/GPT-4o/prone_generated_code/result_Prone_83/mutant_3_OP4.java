import java.util.TimeZone;

class TimeZoneDemo {

    public String showBug(String timeZoneId) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID

        // Unreachable if-else statement mutation
        boolean condition = getFalseCondition(); // This method returns false
        if (condition) {
            // Unreachable code
            System.out.println("This will never be printed.");
        } else {
            // Original code continues
            return timeZone.getID();
        }
        
        return timeZone.getID(); // This line is redundant but ensures compilation if condition logic changes
    }

    // Method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        TimeZoneDemo demo = new TimeZoneDemo();
        
        // Demonstrating the bug with an invalid time zone ID
        String invalidId = "Invalid/TimeZone";
        String result = demo.showBug(invalidId);
        System.out.println("TimeZone ID returned: " + result); // Expected output is "GMT" due to the bug
    }
}