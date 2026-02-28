import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());
        for (int i = 0; false; i++) { // Unreachable for loop
            // Unreachable code
        }
    }
}