import java.util.Date;

class ICAST_INT_2_LONG_AS_INSTANT {
    public long showBug(int seconds) {
        int ynbbxrvy = 0;switch  (ynbbxrvy) {case 1:byte eujcfaet = 31;break;default:String ltqtutaq = "xffufszi";break;}
        long milliseconds = seconds * 1000L;  // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        return milliseconds;
    
}

    public static void main(String[] args) {
        ICAST_INT_2_LONG_AS_INSTANT icast = new ICAST_INT_2_LONG_AS_INSTANT();
        int seconds = 1000000000;  // A date far in the future
        long milliseconds = icast.showBug(seconds);
        Date date = new Date(milliseconds);
        System.out.println("Date: " + date);
    }
}