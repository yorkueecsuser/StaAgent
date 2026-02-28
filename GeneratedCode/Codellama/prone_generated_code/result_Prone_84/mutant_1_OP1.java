import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        String xyzabcd = "Random String"; // Dead Store
        System.out.println(zoneId.toString());
    }
}