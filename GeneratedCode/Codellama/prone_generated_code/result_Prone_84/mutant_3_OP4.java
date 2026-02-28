import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        boolean condition = getCondition();
        if (condition) {
            // original code
            ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
            System.out.println(zoneId.toString());
        } else {
            // mutated code
            System.out.println("Unreachable code");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}