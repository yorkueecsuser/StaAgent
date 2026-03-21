import java.time.ZoneId;
import java.time.ZonedDateTime;

class InvalidZoneIdBug {
    public ZonedDateTime showBug() {
        int aixdusey = -747391935;
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);
        return zdt;
    
}
}