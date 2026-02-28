import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("This is an unreachable loop");
        }

        return dateTime;
    }

    private boolean getCondition() {
        // This method is used to ensure the condition of the for loop is dynamically determined at runtime
        return false;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}