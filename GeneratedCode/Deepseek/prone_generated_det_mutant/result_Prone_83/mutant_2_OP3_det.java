import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        if (true && true && false && false && true && false && false && true && false && false && false) {double nzzlhzok = 520048257;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}