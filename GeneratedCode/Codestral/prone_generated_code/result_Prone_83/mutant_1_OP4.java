import java.util.TimeZone;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID

        // Mutant: Unreachable if-else statement
        boolean shouldRun = false; // Always false to make it unreachable
        if (shouldRun) {
            System.out.println("This line is unreachable");
        } else {
            // Alternative code that will never be executed
            // For example, a print statement
            System.out.println("This line is also unreachable");
        }

        return timeZone;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}