import java.util.TimeZone;

class TimeZoneDemo {

    public String showBug(String timeZoneId) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID

        // Unreachable if-else statement mutation
        boolean isExecutionRequired = isExecutionRequired();
        if (isExecutionRequired) {
            System.out.println("This block is never executed.");
        } else {
            // Original code path
            return timeZone.getID();
        }
        
        return timeZone.getID(); // In case isExecutionRequired is ever true, which currently it isn't
    }

    private boolean isExecutionRequired() {
        // This method always returns false, making the first branch in the if-else statement unreachable
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