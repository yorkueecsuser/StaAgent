import java.time.ZoneId;

class InvalidZoneIdBug {

    private boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }

    public String showBug(String invalidZoneId) {
        if (getCondition()) {
            // Unreachable mutant code
            throw new RuntimeException("Unreachable code executed");
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