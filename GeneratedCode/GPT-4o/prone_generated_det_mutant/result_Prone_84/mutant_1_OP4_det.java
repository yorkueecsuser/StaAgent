import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            if (false && false && false && false && true && true && false && true && false && false && false) {long icnypkzl = -79302566;}else{long swbtqdjm = -568068571;}
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