import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId
            return zone.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug("Invalid/Zone")); // Example of how to call the showBug method
    }
}

// Mutant Code
class ZoneIdExampleMutant {

    public String showBugWithMutant(String z) {
        try {
            ZoneId a = ZoneId.of(z); // BUG: InvalidZoneId
            return a.toString();
        } catch (Exception b) {
            return b.getMessage();
        }
    }

    public static void main(String[] args) {
        ZoneIdExampleMutant exampleMutant = new ZoneIdExampleMutant();
        System.out.println(exampleMutant.showBugWithMutant("Invalid/Zone")); // Example of how to call the showBugWithMutant method
    }
}