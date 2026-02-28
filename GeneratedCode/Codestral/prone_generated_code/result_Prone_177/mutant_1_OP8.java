import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z")); // Original line

        // Mutant code
        ZonedDateTime dateTimeA = ZonedDateTime.now(ZoneId.of("A"));
        return dateTimeA;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}