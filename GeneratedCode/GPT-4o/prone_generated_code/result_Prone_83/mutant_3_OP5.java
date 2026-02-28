import java.util.TimeZone;

class TimeZoneDemo {

    public String showBug(String timeZoneId) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        // Unreachable switch statement mutant
        int unreachableValue = getUnreachableValue(); // Dynamically determined value
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("This will never be printed either.");
                break;
            default:
                System.out.println("This is the default case, but unreachableValue will never match any case.");
                break;
        }
        return timeZone.getID();
    }

    // Method to simulate a runtime-determined value, always returning a value that doesn't match any switch case
    private int getUnreachableValue() {
        return -1; // Ensures that the switch statement remains logically unreachable
    }

    public static void main(String[] args) {
        TimeZoneDemo demo = new TimeZoneDemo();
        
        // Demonstrating the bug with an invalid time zone ID
        String invalidId = "Invalid/TimeZone";
        String result = demo.showBug(invalidId);
        System.out.println("TimeZone ID returned: " + result); // Expected output is "GMT" due to the bug
    }
}