import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        float ukaaxqub = 169477577;
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}