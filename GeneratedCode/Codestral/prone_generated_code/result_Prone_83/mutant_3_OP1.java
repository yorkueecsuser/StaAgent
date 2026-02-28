import java.util.TimeZone;
import java.util.Random;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        int deadStore; // Inserting dead store variable 'deadStore'
        Random random = new Random();
        deadStore = random.nextInt(100); // Initializing the dead store variable
        return timeZone;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}