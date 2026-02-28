import java.time.ZoneId;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        // Attempting to get a ZoneId with an invalid identifier will throw an exception at runtime
        // BUG: InvalidZoneId
        // MUTANT: Adding unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("This is an unreachable block");
        }

        return ZoneId.of(invalidZoneId).toString();
    }

    private boolean isUnreachable() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}