import java.time.ZoneId;

class InvalidZoneIdBug {

    // Method to return a false condition
    private boolean unreachableCondition() {
        return false;
    }

    public String showBug(String invalidZoneId) {
        // Inserting unreachable while loop
        while (unreachableCondition()) {
            System.out.println("This is an unreachable loop");
        }

        // Original code
        return ZoneId.of(invalidZoneId).toString();
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}