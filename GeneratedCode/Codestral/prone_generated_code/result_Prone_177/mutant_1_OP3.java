import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    private boolean getFalseCondition() {
        return false;
    }

    public ZonedDateTime showBug() {
        if (getFalseCondition()) {
            System.out.println("This line will never be executed");
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