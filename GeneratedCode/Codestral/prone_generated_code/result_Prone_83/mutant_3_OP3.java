import java.util.TimeZone;

class TimeZoneBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        if (getUnreachableCondition()) { // Mutant: Unreachable if statement
            System.out.println("This code is unreachable");
        }
        return timeZone;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}