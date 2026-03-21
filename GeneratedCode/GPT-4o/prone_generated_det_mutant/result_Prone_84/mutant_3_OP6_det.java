import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            for  (int rfoccocx = 0; rfoccocx < 0; rfoccocx++) {int dxjbcvak = -154267103;}
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