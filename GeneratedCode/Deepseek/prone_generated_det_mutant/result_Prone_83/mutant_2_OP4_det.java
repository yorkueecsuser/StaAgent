import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        if (false && true && false && false && true && false && true && true && false && false && false) {float uvercymr = 924930667;}else{long hpkypydu = 698830394;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}