import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        if (true && false && false && false && true && false && false && true && true && true && false) {byte oxwnwhdo = -13;}else{double twfddfjj = -79217346;}
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());
    
}
}