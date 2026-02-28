import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());

        // Add unreachable if-else statement
        if (getCondition()) {
            // do something
        } else {
            // do something else
        }
    }

    private static boolean getCondition() {
        // return a non-final variable or an equivalent method call
        return true;
    }
}