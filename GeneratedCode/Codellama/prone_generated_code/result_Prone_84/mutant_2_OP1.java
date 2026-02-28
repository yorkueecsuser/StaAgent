import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        String deadStore = "abcdefg"; // Dead Store
        System.out.println(zoneId.toString());
    }
}