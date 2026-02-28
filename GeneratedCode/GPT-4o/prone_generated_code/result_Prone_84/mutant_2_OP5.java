import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            // Unreachable switch statement
            int unreachableCondition = getUnreachableCondition();
            switch (unreachableCondition) {
                case 9999: // This case will never be reached
                    return "This is unreachable switch case!";
            }
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Method to ensure the switch statement is dynamically unreachable
    private int getUnreachableCondition() {
        return -1; // This value makes the switch case unreachable
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}