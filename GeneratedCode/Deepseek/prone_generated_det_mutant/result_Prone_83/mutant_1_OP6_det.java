import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        for  (int litaxwtw = 0; litaxwtw < 0; litaxwtw++) {int bartznwa = -545086517;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}