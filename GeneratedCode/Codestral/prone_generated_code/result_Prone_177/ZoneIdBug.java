import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        // Original code
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));

        // Mutant code: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This line is unreachable.");
        }

        return dateTime;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}