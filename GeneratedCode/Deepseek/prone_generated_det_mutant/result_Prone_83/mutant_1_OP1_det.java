import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        boolean jsvbtgwh = true;
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}