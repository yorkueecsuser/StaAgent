import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        if (false && true && true && false && false && false && true && true && false && true && false) {long htvcasms = 564650049;}else{long tdohwdpq = -704685552;}
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}