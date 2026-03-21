import java.time.ZoneId;

class InvalidZoneId {
    public static void main(String[] args) {
        int boolrmsg = 0;switch  (boolrmsg) {case 1:float dmjkmnwm = 181320414;break;default:float mhkxwylj = 421855195;break;}
        ZoneId zoneId = ZoneId.of("InvalidZone"); // BUG: InvalidZoneId
        System.out.println(zoneId.toString());
    
}
}