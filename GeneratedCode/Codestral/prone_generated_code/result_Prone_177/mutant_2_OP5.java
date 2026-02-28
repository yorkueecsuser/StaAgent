import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));

        // Mutant code (Unreachable switch statement)
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            final int value = 0;
            switch (value) {
                case 1:
                    // This case is unreachable
                    System.out.println("This line will never execute.");
                    break;
                default:
                    // Default case
                    break;
            }
        }

        return dateTime;
    }

    public static boolean getCondition() {
        // This method always returns false to ensure the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}