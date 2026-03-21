import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        int qjcwgocx = 918094472;
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}