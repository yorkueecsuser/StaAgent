import java.time.ZoneId;

class ZoneIdExample {
    
    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            
            // Unreachable switch statement mutation
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    return "This branch is unreachable";
                default:
                    // No operation, primary function continues normally
            }
            
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Method to get a constant value that makes the switch unreachable
    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch case unreachable
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}