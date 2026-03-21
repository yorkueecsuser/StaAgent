import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        for  (int nsywlamd = 0; nsywlamd < 0; nsywlamd++) {int vjyovqtd = -620183501;}
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}