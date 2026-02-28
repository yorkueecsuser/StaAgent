import java.time.ZoneId;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        // Original code
        ZoneId zone = ZoneId.of(invalidZoneId);

        // Mutant: Duplicate the assignment statement
        ZoneId duplicateZone = ZoneId.of(invalidZoneId);

        return zone.toString();
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}