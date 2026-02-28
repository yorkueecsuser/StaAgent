import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());

        // Inserted unreachable while loop
        while (false) {
            // This loop is always false and has no effect on the program's behavior
            System.out.println("This code is unreachable");
        }
    }
}