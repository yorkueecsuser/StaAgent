import java.time.ZoneId;

class InvalidZoneIdBug {

    private boolean getCondition() {
        return false; // Always returns false to make the switch statement unreachable
    }

    public String showBug(String invalidZoneId) {
        // Attempting to get a ZoneId with an invalid identifier will throw an exception at runtime
        // BUG: InvalidZoneId
        String zoneIdString = ZoneId.of(invalidZoneId).toString();

        // Mutant: Unreachable switch statement
        if (getCondition()) {
            int fakeValue = 1;
            switch (fakeValue) {
                case 1:
                    System.out.println("This statement is unreachable.");
                    break;
            }
        }
        return zoneIdString;
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}