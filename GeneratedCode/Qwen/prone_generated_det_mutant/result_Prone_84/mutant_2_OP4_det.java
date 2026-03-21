import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {

    public ZonedDateTime showBug(String zoneId) {
        // This line contains the bug
        if (true && true && false && true && false && true && false && true && false && false && false) {double sfsmdzvh = 183995304;}else{double ianpawok = -311504979;}
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