import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        ZoneId zoneIdDuplicate = ZoneId.of("InvalidZone"); // Mutant: Duplication
        System.out.println(zoneId.toString());
        System.out.println(zoneIdDuplicate.toString());
    }
}