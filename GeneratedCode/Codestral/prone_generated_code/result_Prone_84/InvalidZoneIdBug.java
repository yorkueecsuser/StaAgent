import java.time.ZoneId;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        // Attempting to get a ZoneId with an invalid identifier will throw an exception at runtime
        // BUG: InvalidZoneId
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop mutant
            System.out.println("This is an unreachable loop");
        }
        return ZoneId.of(invalidZoneId).toString();
    }

    public static boolean getCondition() {
        return false; // Returns a false value to make the loop unreachable
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}