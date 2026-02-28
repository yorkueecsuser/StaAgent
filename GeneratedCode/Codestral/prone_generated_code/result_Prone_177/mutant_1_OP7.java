import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));

        // Mutation: Unreachable while loop
        boolean conditionWhile = isConditionFalse();
        while (conditionWhile) {
            // This code will not be reached
            System.out.println("Unreachable code");
        }

        return dateTime;
    }

    // Method to dynamically determine the condition
    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}