import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());

        // Unreachable switch statement mutant
        switch (0) {
            case 1:
                /* code */
                break;
        }
    }
}