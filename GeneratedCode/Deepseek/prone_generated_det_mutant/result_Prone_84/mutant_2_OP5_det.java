import java.time.ZoneId;
import java.time.ZonedDateTime;

class InvalidZoneIdBug {
    public ZonedDateTime showBug() {
        int rxwvtqwl = 0;switch  (rxwvtqwl) {case 1:double wpksbnhd = 808116083;break;default:byte ibdsteyw = 95;break;}
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);
        return zdt;
    
}
}