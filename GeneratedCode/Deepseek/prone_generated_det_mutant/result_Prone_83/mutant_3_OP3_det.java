import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        if (true && false && false && false && false && true && true && false && false && false && false) {long smalymmu = 566884615;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}