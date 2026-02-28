import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());

        // Mutant code
        if (false) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is reachable.");
        }
    }
}