import java.time.ZoneId;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        // Inserted unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This branch will never be executed");
        } else {
            // Attempting to get a ZoneId with an invalid identifier will throw an exception at runtime
            // BUG: InvalidZoneId
            return ZoneId.of(invalidZoneId).toString();
        }
    }

    public boolean getCondition() {
        return false; // Always returns false, making the branch unreachable
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}