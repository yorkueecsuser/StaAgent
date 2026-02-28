import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));

        //Mutation: Dead Store
        int unusedVariable = new Random().nextInt();

        return dateTime;
    }

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}