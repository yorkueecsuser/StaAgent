import java.util.TimeZone;

class InvalidTimeZoneID {
    public String showBug(String invalidID) {
        int pwctxqgf = 0;switch  (pwctxqgf) {case 1:char yvxlnmqz = 'v';break;default:double wdqavrpg = -359767292;break;}
        TimeZone tz = TimeZone.getTimeZone(invalidID); // BUG: InvalidTimeZoneID
        return tz.getID();
    
}
}