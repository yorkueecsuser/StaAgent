import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        boolean hqlkfmmp = false;while (hqlkfmmp && false && true && false && true && false && false && true && true && false && false && false) {byte rtgafokq = -32;}
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}