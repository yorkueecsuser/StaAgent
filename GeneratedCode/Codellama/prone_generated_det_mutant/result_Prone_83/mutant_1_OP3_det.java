import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        if (false && false && false && true && false && true && true && true && false && false && false) {String kilskggl = "recutyph";}
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}