import java.util.TimeZone;

class TimeZoneBug {
public static void main(String [] args){
    TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
    timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
    System.out.println(timeZone.getDisplayName());
}
}