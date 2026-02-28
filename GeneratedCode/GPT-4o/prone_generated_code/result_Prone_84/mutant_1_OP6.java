import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            
            // Inserting unreachable for loop as per mutation operator
            boolean conditionFor = getLoopCondition(); // This ensures the loop condition is dynamically determined
            for (int i = 0; conditionFor; i++) {
                // This block will never execute
                System.out.println("This is an unreachable for loop.");
            }
            
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Method to provide a non-final variable for the loop condition
    private boolean getLoopCondition() {
        return false; // Always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}