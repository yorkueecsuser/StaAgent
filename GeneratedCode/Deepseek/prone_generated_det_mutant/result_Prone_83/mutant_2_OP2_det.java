import java.util.TimeZone;

class InvalidTimeZoneID {
public String showBug(String invalidID){
    TimeZone tz = TimeZone.getTimeZone(invalidID);
    tz = TimeZone.getTimeZone(invalidID);
    return tz.getID();
}
}