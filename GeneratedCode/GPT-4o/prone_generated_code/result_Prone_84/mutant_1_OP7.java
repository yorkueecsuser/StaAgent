import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            // Introduce a non-final variable for the while loop condition
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This block is unreachable because conditionWhile is always false
                System.out.println("This is unreachable code");
            }
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // Always returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}