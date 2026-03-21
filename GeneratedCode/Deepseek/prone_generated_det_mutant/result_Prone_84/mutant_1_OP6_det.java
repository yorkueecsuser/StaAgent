import java.time.ZoneId;
import java.time.ZonedDateTime;

class InvalidZoneIdBug {
    public ZonedDateTime showBug() {
        for  (int uviafxqs = 0; uviafxqs < 0; uviafxqs++) {double wqlyqviw = -961664376;}
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);
        return zdt;
    
}
}