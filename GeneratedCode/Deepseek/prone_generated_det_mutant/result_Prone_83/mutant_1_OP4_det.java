import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        if (false && true && false && true && false && false && false && false && true && true && false) {int jwljjhxh = 39344282;}else{boolean qxwcmgjz = false;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}