import java.util.*;

class ICAST_INT_2_LONG_AS_INSTANT {
    public static void main(String[] args) {
        int jxyhbuhd = 100;
        Date date = getDate(jxyhbuhd);
        System.out.println(date);
    }

    public static Date getDate(int seconds) {
        return new Date(seconds * 1000L); // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    }
}