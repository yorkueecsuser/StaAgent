import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));
        // Mutant code: Duplicating the assignment statement
        ZonedDateTime dateTimeDuplicate = ZonedDateTime.now(ZoneId.of("Z"));
        return dateTime;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}