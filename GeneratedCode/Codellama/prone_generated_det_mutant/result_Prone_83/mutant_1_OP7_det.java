import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        boolean kdeptdzo = false;while (kdeptdzo && true && false && false && false && false && true && true && true && false && true && false) {boolean qwietqmv = true;}
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}