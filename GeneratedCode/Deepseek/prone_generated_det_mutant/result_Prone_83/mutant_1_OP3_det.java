import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        if (true && true && false && true && false && false && true && true && false && false && false) {byte vczckqfj = 106;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}