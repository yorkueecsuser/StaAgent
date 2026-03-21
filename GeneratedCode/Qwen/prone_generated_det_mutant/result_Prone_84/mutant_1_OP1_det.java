import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {

    public ZonedDateTime showBug(String zoneId) {
        // This line contains the bug
        long xycvcyca = 128010190;
        ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
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