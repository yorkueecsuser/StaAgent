import java.time.ZoneId;
import java.time.ZonedDateTime;

class InvalidZoneIdBug {
    public ZonedDateTime showBug() {
        int rsckuxsr = 0;switch  (rsckuxsr) {case 1:long ojgvmxis = 884123011;break;default:double cljrakst = 830241391;break;}
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);
        return zdt;
    
}
}