import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        double qsrbmuce = 978193940;
        System.out.println(zoneId.toString());
    
}
}