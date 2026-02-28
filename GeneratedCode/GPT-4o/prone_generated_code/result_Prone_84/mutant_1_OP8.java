import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            // Original code
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Mutated version with variable renaming
    public String showBugMutant(String zoneId) {
        try {
            // Renamed variable 'zone' to 'a'
            ZoneId a = ZoneId.of(zoneId); // BUG: InvalidZoneId
            return a.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
        System.out.println(example.showBugMutant("Invalid/Zone")); // Example of how to call the showBugMutant method
    }
}