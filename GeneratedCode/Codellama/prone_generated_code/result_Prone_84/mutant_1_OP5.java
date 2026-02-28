import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());
        
        // Unreachable switch statement mutant
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    private static int getValue() {
        return 2;
    }
}