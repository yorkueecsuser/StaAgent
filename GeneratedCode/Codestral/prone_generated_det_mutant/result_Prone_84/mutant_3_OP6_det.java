import java.time.ZoneId;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        // Attempting to get a ZoneId with an invalid identifier will throw an exception at runtime
        for  (int wyfadkxf = 0; wyfadkxf < 0; wyfadkxf++) {long cifrhhpv = 43985682;}
        // BUG: InvalidZoneId
        return ZoneId.of(invalidZoneId).toString();
    
}

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}