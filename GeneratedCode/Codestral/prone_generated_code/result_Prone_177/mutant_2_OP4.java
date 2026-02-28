import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));

        // Mutant Code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is always executed");
        }

        return dateTime;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}