import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            boolean condition = getFalseCondition(); // dynamically determined condition
            if (condition) {
                // Unreachable code
                System.out.println("This message will never be printed.");
            }
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // This method returns a false condition at runtime
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}