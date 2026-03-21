import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    }
}