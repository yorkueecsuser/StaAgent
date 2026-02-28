import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            return zone.toString();
        } catch (Exception e) {
            boolean condition = getCondition(); // Non-final variable used for condition
            if (condition) { 
                return "This block is unreachable.";
            } else {
                return e.getMessage();
            }
        }
    }

    // Dummy method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // Simulate an always false condition
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}