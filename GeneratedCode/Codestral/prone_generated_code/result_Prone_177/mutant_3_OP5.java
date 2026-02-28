import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));

        // Mutated code: Unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code");
                break;
            // No default case to ensure unreachable switch statement
        }

        return dateTime;
    }

    // Method that always returns a value that is not 1 to make the switch statement unreachable
    private int getUnreachableValue() {
        return 2;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}