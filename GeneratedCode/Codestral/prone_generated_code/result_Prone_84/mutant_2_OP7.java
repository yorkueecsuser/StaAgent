import java.time.ZoneId;

class InvalidZoneIdBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String invalidZoneId) {
        // Adding unreachable while loop
        while (getFalseCondition()) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop.");
        }

        // Attempting to get a ZoneId with an invalid identifier will throw an exception at runtime
        // BUG: InvalidZoneId
        return ZoneId.of(invalidZoneId).toString();
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}