import java.util.Date;

class ICAST_INT_2_LONG_AS_INSTANT {
    public long showBug(int seconds) {
        short bkztgfjv = -6178;
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