import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        for  (int esdxzclr = 0; esdxzclr < 0; esdxzclr++) {boolean xbxwwtnc = true;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}