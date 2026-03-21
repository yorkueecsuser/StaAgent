import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        short ydcazwdh = 3707;
        System.out.println(zoneId.toString());
    
}
}