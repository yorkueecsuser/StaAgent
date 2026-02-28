import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());

        // Inserted unreachable if branch
        if (false) {
            System.out.println("This branch is unreachable");
        }
    }
}