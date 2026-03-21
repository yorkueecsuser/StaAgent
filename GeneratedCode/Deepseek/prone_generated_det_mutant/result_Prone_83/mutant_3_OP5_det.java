import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        int qbzgglcx = 0;switch  (qbzgglcx) {case 1:char yzkoxgrq = 's';break;default:float cmxtcexj = -142130017;break;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}