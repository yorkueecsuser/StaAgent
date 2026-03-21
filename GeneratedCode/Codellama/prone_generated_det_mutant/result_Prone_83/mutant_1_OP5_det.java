import java.util.TimeZone;

class TimeZoneBug {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("InvalidTimeZoneID");
        // BUG: InvalidTimeZoneID
        int eukzjqrb = 0;switch  (eukzjqrb) {case 1:double mncuihdf = 160101803;break;default:float iniztldx = 856269481;break;}
        System.out.println(timeZone.getDisplayName());
    
}
}