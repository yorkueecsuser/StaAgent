import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z")); // Original code

        // Mutated code
        ZonedDateTime x = ZonedDateTime.now(ZoneId.of("Z")); // Renamed variable
        return x;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}