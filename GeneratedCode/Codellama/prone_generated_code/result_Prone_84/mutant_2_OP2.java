import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());
    }
}

// Mutant 1: Duplicated assignment statement
class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        ZoneId duplicatedZoneId = ZoneId.of("InvalidZone"); // Mutant 1: Duplicated assignment statement
        System.out.println(zoneId.toString());
    }
}

// Mutant 2: Duplicated assignment statement
class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());
        ZoneId duplicatedZoneId = ZoneId.of("InvalidZone"); // Mutant 2: Duplicated assignment statement
    }
}