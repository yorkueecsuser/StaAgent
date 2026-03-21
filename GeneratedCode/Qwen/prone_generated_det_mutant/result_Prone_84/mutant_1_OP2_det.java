import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {
public ZonedDateTime showBug(String zoneId){
    ZoneId zone = ZoneId.of(zoneId);
    zone = ZoneId.of(zoneId);
    return ZonedDateTime.now(zone);
}

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        try {
            example.showBug("NonExistent/TimeZone");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}