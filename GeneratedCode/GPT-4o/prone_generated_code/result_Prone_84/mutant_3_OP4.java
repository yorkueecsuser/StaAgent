import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            return zone.toString();
        } catch (Exception e) {
            // Adding unreachable if-else statement
            boolean condition = isValid(); // Dynamically determined at runtime
            if (condition) {
                return "This will never be reached"; // Unreachable code
            } else {
                return e.getMessage();
            }
        }
    }

    // Method to simulate runtime condition determination
    private boolean isValid() {
        return false; // Always returns false making the if-block unreachable
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}