import java.time.ZoneId;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        String renamedZoneId = invalidZoneId;  // New variable'renamedZoneId' added
        // Attempting to get a ZoneId with an invalid identifier will throw an exception at runtime
        // BUG: InvalidZoneId
        return ZoneId.of(renamedZoneId).toString();
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}