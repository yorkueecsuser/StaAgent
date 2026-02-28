import java.util.TimeZone;

class TimeZoneDemo {

    public String showBug(String timeZoneId) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        
        // Unreachable switch statement added as a mutant
        int value = getUnreachableValue();
        switch (value) {
            case 999: // This case is unreachable
                System.out.println("This line will never be printed.");
                break;
            default:
                break;
        }
        
        return timeZone.getID();
    }
    
    private int getUnreachableValue() {
        // This method ensures the switch statement is always unreachable
        return 998; // Value that doesn't match any case in the switch statement
    }

    public static void main(String[] args) {
        TimeZoneDemo demo = new TimeZoneDemo();
        
        // Demonstrating the bug with an invalid time zone ID
        String invalidId = "Invalid/TimeZone";
        String result = demo.showBug(invalidId);
        System.out.println("TimeZone ID returned: " + result); // Expected output is "GMT" due to the bug
    }
}