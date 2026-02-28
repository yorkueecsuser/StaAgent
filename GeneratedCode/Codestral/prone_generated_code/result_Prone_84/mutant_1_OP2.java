import java.time.ZoneId;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        // Original assignment statement
        String zoneIdString = ZoneId.of(invalidZoneId).toString();

        // Duplicated assignment statement
        String duplicatedZoneIdString = ZoneId.of(invalidZoneId).toString();

        // Returning the result from the original assignment statement
        return zoneIdString;
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}