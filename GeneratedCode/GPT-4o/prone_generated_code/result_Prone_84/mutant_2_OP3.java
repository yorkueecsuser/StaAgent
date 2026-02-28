import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            // Introduce a variable that will always be false at runtime
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This code will never be executed
                return "Unreachable code block";
            }
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Method to simulate a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}