import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        // BUG: InvalidTimeZoneID
        if (false && true && true && true && true && false && false && false && true && true && false) {long rcurtpho = -297955400;}else{boolean ykxyipoe = false;}
        System.out.println(timeZone.getDisplayName());
    
}
}