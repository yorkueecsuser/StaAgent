import java.time.ZoneId;

class InvalidZoneIdBug {

    private boolean getUnreachableCondition() {
        return false; // This condition will always be false, making the branch unreachable
    }

    public String showBug(String invalidZoneId) {
        if (getUnreachableCondition()) {
            // This is an unreachable branch
            throw new AssertionError("This branch is unreachable!");
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