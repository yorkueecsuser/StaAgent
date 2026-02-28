import java.util.TimeZone;
import java.util.Random;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        // Dead store mutation applied here
        Random rand = new Random();
        int unusedVariable = rand.nextInt(1000);

        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        return timeZone;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}