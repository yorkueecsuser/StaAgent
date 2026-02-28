import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());

        // Renaming: "zoneId" renamed to "z"
        ZoneId z = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(z.toString());
    }
}