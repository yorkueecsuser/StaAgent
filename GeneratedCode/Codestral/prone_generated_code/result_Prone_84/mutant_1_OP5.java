import java.time.ZoneId;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        // Attempting to get a ZoneId with an invalid identifier will throw an exception at runtime
        // BUG: InvalidZoneId
        String zoneIdResult = ZoneId.of(invalidZoneId).toString();

        // MUTANT: Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return zoneIdResult;
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}