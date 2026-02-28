import java.time.ZoneId;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        String z = ZoneId.of(invalidZoneId).toString(); // Added mutant code
        return z;
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String i = "Invalid/Zone/Identifier"; // Renamed variable 'invalidZoneId' to 'i'
        System.out.println(bugDemo.showBug(i));
    }
}