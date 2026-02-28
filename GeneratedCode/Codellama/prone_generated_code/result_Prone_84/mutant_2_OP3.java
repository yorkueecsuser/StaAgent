import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
            System.out.println(zoneId.toString());
        } else {
            // unreachable branch
            System.out.println("This statement is unreachable");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}