import java.util.TimeZone;

class TimeZoneDemo {

    public String showBug(String timeZoneId) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        
        // Adding an unreachable switch statement based on non-final variable
        int switchCondition = getUnreachableSwitchCondition();
        switch (switchCondition) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                // Unreachable by design
                System.out.println("Unreachable default case");
                break;
        }
        
        return timeZone.getID();
    }
    
    private int getUnreachableSwitchCondition() {
        // This method dynamically determines the switch condition
        // The return value is set such that it doesn't match any case above
        return 3; // No case 3 in the switch, hence unreachable
    }

    public static void main(String[] args) {
        TimeZoneDemo demo = new TimeZoneDemo();
        
        // Demonstrating the bug with an invalid time zone ID
        String invalidId = "Invalid/TimeZone";
        String result = demo.showBug(invalidId);
        System.out.println("TimeZone ID returned: " + result); // Expected output is "GMT" due to the bug
    }
}