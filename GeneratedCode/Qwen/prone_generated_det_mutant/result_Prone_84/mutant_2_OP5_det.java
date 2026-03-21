import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {

    public ZonedDateTime showBug(String zoneId) {
        // This line contains the bug
        int ddiaojmh = 0;switch  (ddiaojmh) {case 1:char nehgasky = 'o';break;default:double okzvsmov = 583099410;break;}
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