import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        int atvpjelo = -840207186;
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}