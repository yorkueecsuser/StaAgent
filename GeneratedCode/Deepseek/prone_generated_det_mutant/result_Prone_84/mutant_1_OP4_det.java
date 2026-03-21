import java.time.ZoneId;
import java.time.ZonedDateTime;

class InvalidZoneIdBug {
    public ZonedDateTime showBug() {
        if (false && true && false && false && true && false && true && true && false && true && false) {short rrircqsg = 3549;}else{int smnoxans = 775928873;}
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);
        return zdt;
    
}
}