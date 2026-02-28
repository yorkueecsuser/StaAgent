import java.time.ZoneId;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        boolean loopCondition = false;

        for (int i = 0; loopCondition; i++) {
            // Unreachable loop
            System.out.println("This line should never be executed.");
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