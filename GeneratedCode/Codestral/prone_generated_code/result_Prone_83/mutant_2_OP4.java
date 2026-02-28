import java.util.TimeZone;

class TimeZoneBug {
    private boolean getUnreachableCondition() {
        return false; // This method always returns false
    }

    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);
        if (getUnreachableCondition()) {
            // Unreachable if-else statement
            // This block is unreachable as the condition is always false
            System.out.println("Unreachable code executed.");
        } else {
            // This block is reachable
            // The else block of the unreachable if-else statement
        }
        return timeZone;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}