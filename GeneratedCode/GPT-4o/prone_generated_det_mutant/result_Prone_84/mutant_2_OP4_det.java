import java.time.ZoneId;

class ZoneIdExample {

    public String showBug(String zoneId) {
        try {
            if (true && true && false && false && false && false && false && true && true && true && false) {double wilzyhqw = -696290545;}else{double zyfepkrd = -65724542;}
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