import java.util.TimeZone;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        TimeZone tz = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        return tz; // Return the renamed variable
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone tz = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + tz.getID());
    }
}