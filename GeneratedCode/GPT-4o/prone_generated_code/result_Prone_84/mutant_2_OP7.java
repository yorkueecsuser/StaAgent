import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            // Unreachable while loop mutation
            boolean conditionWhile = getUnreachableCondition();
            while (conditionWhile) {
                // This block will never execute
                System.out.println("This is an unreachable code block inside the while loop.");
            }
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Method to provide the condition for the unreachable while loop
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}