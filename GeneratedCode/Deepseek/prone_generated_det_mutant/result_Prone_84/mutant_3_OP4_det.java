import java.time.ZoneId;
import java.time.ZonedDateTime;

class InvalidZoneIdBug {
    public ZonedDateTime showBug() {
        if (true && false && false && true && false && true && false && false && true && true && false) {byte xupfumna = -127;}else{short wgttrchj = 2217;}
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);
        return zdt;
    
}
}