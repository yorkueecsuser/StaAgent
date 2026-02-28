import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));

        // Mutant code: Unreachable if-else block
        if (alwaysFalse()) {
            // This code is unreachable
            ZonedDateTime unreachableDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
            return unreachableDateTime;
        } else {
            return dateTime;
        }
    }

    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}