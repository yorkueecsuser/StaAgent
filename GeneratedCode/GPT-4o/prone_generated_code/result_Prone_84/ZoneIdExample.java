import java.time.ZoneId;

class ZoneIdExample {

    private boolean getCondition() {
        // Dynamically determine the condition, but it will always return false at runtime.
        return System.currentTimeMillis() < 0;
    }

    public String showBug(String zoneId) {
        boolean conditionWhile = getCondition(); // Ensuring the condition is dynamically determined

        while (conditionWhile) {
            // This loop is unreachable because the condition is always false at runtime
            // but adheres to the guideline of dynamic condition
            System.out.println("This is an unreachable while loop.");
        }
        
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
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