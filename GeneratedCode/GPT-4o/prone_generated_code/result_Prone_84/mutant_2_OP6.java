import java.time.ZoneId;

class ZoneIdExample {

    private boolean getUnreachableCondition() {
        return false; // simulate an unreachable condition
    }

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            // Unreachable for loop
            for (int i = 0; getUnreachableCondition(); i++) {
                System.out.println("This will never be printed.");
            }
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}