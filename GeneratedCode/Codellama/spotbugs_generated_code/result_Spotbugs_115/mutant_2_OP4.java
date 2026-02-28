import java.util.*;

class ICAST_INT_2_LONG_AS_INSTANT {
    public static void main(String[] args) {
        int seconds = 100;
        Date date = getDate(seconds);
        System.out.println(date);
    }

    public static Date getDate(int seconds) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return new Date(seconds * 1000L);
        } else {
            return new Date(seconds * 1000L);
        }
    }

    public static boolean getCondition() {
        return false;
    }
}