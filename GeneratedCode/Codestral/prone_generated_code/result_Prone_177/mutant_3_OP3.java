import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    private boolean getCondition() {
        return false; // This method always returns false to make the if statement unreachable
    }

    public ZonedDateTime showBug() {
        if (getCondition()) {
            System.out.println("Unreachable code");
        }
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));
        return dateTime;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}