import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        String dotftzjv = "jiawtdtg";
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}