import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        if (false) {
            // Unreachable branch to simulate a compiler bug
            System.out.println("This code should not be reached.");
        }
        System.out.println(zoneId.toString());
    }
}