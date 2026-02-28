import java.util.TimeZone;

class TimeZoneDemo {

    public String showBug(String timeZoneId) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        return timeZone.getID();
    }
    
    private boolean getLoopCondition() {
        return false; // Method to ensure the for loop is unreachable
    }

    public static void main(String[] args) {
        TimeZoneDemo demo = new TimeZoneDemo();
        
        // Demonstrating the bug with an invalid time zone ID
        String invalidId = "Invalid/TimeZone";
        String result = demo.showBug(invalidId);
        System.out.println("TimeZone ID returned: " + result); // Expected output is "GMT" due to the bug

        // Unreachable for loop
        boolean conditionFor = demo.getLoopCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed.");
        }
    }
}