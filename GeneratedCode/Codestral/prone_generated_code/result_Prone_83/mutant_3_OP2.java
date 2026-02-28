import java.util.TimeZone;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        // Mutant code: Duplicate the assignment statement
        TimeZone duplicateTimeZone = timeZone;
        return timeZone;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
        // Mutant code: Added a print statement to check the duplicateTimeZone
        System.out.println("Duplicate TimeZone: " + duplicateTimeZone.getID());
    }
}