import java.time.ZoneId;

class InvalidZoneId {
public static void main(String [] args){
    ZoneId zoneId = ZoneId.of("InvalidZone");
    zoneId = ZoneId.of("InvalidZone");
    System.out.println(zoneId.toString());
}
}