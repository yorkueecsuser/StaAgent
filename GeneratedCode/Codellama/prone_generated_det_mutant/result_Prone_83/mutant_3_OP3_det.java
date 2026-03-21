import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        if (false && true && true && false && false && true && false && false && false && true && false) {boolean hyisiupu = false;}
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}