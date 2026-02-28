import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        if (alwaysFalse()) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        }

        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z")); // Original code
        return dateTime;
    }

    private boolean alwaysFalse() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}