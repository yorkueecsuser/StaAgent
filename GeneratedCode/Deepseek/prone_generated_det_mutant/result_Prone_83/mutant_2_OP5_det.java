import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        int oknaydjr = 0;switch  (oknaydjr) {case 1:byte kzyrqqqb = -52;break;default:boolean tzftunns = true;break;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}