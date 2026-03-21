import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        // BUG: InvalidTimeZoneID
        for  (int woooygsa = 0; woooygsa < 0; woooygsa++) {double oierqoqj = 351369677;}
        System.out.println(timeZone.getDisplayName());
    
}
}