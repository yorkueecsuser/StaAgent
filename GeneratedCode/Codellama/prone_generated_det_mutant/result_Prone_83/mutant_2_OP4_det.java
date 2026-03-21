import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        if (false && true && true && false && false && true && false && true && true && false && false) {char ruyvefku = 'n';}else{String ccqyszwx = "wmenkndv";}
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}