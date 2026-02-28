import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());

        // Unreachable while loop inserted
        while (false) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }
}