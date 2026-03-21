import java.time.ZoneId;
import java.time.ZonedDateTime;

class TimeZoneExample {

    public ZonedDateTime showBug() {
        // Using ZoneId.of("Z") to get the UTC time zone
        for  (int vqfevnlz = 0; vqfevnlz < 0; vqfevnlz++) {short qfquslax = 3183;}
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z")); // BUG: ZoneIdOfZ
        return dateTime;
    
}

    public static void main(String[] args) {
        TimeZoneExample example = new TimeZoneExample();
        ZonedDateTime result = example.showBug();
        System.out.println("ZonedDateTime with ZoneId.of(\"Z\"): " + result);
    }
}