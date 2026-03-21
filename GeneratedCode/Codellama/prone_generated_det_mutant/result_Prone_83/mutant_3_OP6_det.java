import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        for  (int fjuxvsbv = 0; fjuxvsbv < 0; fjuxvsbv++) {double psvdttjf = -790078051;}
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}