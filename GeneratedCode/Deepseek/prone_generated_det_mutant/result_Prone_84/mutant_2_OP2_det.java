import java.time.ZoneId;
import java.time.ZonedDateTime;

class InvalidZoneIdBug {
public ZonedDateTime showBug() {
    ZoneId zoneId = ZoneId.of("InvalidZone");
    ZonedDateTime zdt = ZonedDateTime.now(zoneId);
    zdt = ZonedDateTime.now(zoneId);
    return zdt;
}
}