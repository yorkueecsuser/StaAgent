import java.util.TimeZone;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        boolean shouldNotRun = getCondition(); // Added to ensure the condition is dynamically determined
        if (shouldNotRun) { // Unreachable if branch
            System.out.println("This line should never be executed.");
        }
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        return timeZone;
    }

    private boolean getCondition() {
        return false; // Always returns false to make the branch unreachable
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}