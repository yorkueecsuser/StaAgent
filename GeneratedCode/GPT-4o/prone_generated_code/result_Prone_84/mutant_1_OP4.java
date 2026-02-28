import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            
            // Begin of Mutation: Unreachable if-else statement
            boolean unreachableCondition = getCondition();
            if (unreachableCondition) {
                System.out.println("This block is unreachable");
            } else {
                System.out.println("This else block is also unreachable");
            }
            // End of Mutation: Unreachable if-else statement
            
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Method added to prevent compile-time constant condition
    private boolean getCondition() {
        return false; // This is used to ensure the if-else block remains unreachable
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}