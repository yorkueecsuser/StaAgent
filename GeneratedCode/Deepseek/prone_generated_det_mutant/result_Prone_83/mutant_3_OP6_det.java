import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        for  (int toyppivw = 0; toyppivw < 0; toyppivw++) {double cqdtbbsw = -491999563;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}