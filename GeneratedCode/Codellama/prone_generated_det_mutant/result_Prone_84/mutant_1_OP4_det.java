import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        if (true && true && false && false && false && false && false && true && true && false && false) {boolean hfryzgqh = false;}else{char sbaxuwkv = 's';}
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());
    
}
}