import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        int fmfzzuzh = 0;switch  (fmfzzuzh) {case 1:byte fjbqklxi = -62;break;default:char drlcbrkv = 'b';break;}
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}