import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        short vyqbiluv = 5722;
        System.out.println(zoneId.toString());
    
}
}