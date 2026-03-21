import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            int bztrtiki = 0;switch  (bztrtiki) {case 1:int bayfzyux = -132729007;break;default:short sheqwjif = 3396;break;}
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