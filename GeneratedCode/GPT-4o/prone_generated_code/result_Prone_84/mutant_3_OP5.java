import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            return zone.toString();
        } catch (Exception e) {
            // Unreachable switch statement
            int dummyValue = getDummyValue(); // Dynamically determined value
            switch (dummyValue) {
                case 999: // This case is unlikely to be reached
                    return "Unreachable code in switch statement.";
                default:
                    break;
            }
            return e.getMessage();
        }
    }

    private int getDummyValue() {
        return -1; // This ensures the switch statement doesn't execute the case 999
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}