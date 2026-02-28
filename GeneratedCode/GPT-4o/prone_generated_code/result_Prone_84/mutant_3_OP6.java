import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        // Introducing a non-final variable to ensure dynamic condition evaluation
        boolean conditionFor = getCondition();

        // Inserting an unreachable for loop
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
        }

        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Method to provide a condition that is always false, ensuring the loop is unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}