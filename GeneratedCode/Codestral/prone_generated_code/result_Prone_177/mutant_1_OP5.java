import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        // Inserting unreachable switch statement
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("This code should never execute.");
                break;
        }

        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z")); // This line contains the bug
        return dateTime;
    }

    // Method to return an unreachable value
    private int getUnreachableValue() {
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}