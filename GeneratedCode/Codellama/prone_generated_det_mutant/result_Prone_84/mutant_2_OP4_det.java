import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        if (true && false && false && true && false && false && false && false && false && false && false) {long akqftftv = 533605908;}else{long caowghpz = 563460550;}
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());
    
}
}