import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            // Introduce a non-final variable for the if statement condition
            boolean isUnreachable = checkUnreachable();
            if (isUnreachable) {
                // This block is intentionally unreachable
                return "This code is unreachable";
            }
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    // Method to ensure condition is not a compile-time constant
    private boolean checkUnreachable() {
        return false;
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}