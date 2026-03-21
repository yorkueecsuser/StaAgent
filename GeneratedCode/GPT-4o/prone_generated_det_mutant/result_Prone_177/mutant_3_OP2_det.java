import java.time.ZoneId;
import java.time.ZonedDateTime;

class TimeZoneExample {
public ZonedDateTime showBug() {
    ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));
    dateTime = ZonedDateTime.now(ZoneId.of("Z"));
    return dateTime;
}

    public static void main(String[] args) {
        TimeZoneExample example = new TimeZoneExample();
        ZonedDateTime result = example.showBug();
        System.out.println("ZonedDateTime with ZoneId.of(\"Z\"): " + result);
    }
}