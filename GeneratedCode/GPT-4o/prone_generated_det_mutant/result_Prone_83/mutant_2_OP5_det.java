import java.util.TimeZone;

class TimeZoneDemo {

    public String showBug(String timeZoneId) {
        // Attempt to get a TimeZone object using a potentially invalid time zone ID
        int guteracw = 0;switch  (guteracw) {case 1:double ipgbazva = 57367603;break;default:short naytwtvz = -664;break;}
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID
        return timeZone.getID();
    
}

    public static void main(String[] args) {
        TimeZoneDemo demo = new TimeZoneDemo();
        
        // Demonstrating the bug with an invalid time zone ID
        String invalidId = "Invalid/TimeZone";
        String result = demo.showBug(invalidId);
        System.out.println("TimeZone ID returned: " + result); // Expected output is "GMT" due to the bug
    }
}