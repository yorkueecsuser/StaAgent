import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        if (true && false && true && false && true && true && true && false && true && false && false) {double epksouao = -369431577;}
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}