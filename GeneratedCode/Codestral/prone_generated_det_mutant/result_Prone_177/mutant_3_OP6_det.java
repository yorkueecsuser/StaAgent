import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class ZoneIdBug {
    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        for  (int phtnjsru = 0; phtnjsru < 0; phtnjsru++) {short ghghdmny = 3710;}
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z")); // This line contains the bug as it uses ZoneId.of("Z") instead of ZoneOffset.UTC
        return dateTime;
    
}

    public static void main(String[] args) {
        ZoneIdBug bug = new ZoneIdBug();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(bug.showBug().format(formatter));
    }
}