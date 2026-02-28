import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());
        
        // Unreachable for loop inserted
        for (int i = 0; false; i++) {
            // Unreachable code
        }
    }
}