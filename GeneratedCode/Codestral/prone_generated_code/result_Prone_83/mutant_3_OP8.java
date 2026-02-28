import java.util.TimeZone;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        TimeZone a = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        return a;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone a = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + a.getID());
    }
}