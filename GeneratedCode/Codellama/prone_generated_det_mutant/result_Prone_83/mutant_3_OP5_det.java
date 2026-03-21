import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        int nesstdgg = 0;switch  (nesstdgg) {case 1:char rpqyeeul = 'a';break;default:float azpylcia = 548295366;break;}
        // BUG: InvalidTimeZoneID
        System.out.println(timeZone.getDisplayName());
    
}
}