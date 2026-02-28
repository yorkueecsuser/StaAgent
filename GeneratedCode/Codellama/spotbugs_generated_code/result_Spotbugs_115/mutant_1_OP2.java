import java.util.*;

class ICAST_INT_2_LONG_AS_INSTANT {
    public static void main(String[] args) {
        int seconds = 100;
        Date date = getDate(seconds);
        System.out.println(date);
    }

    public static Date getDate(int seconds) {
        return new Date(seconds * 1000L); // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    }

    // Mutant 1: Duplicated assignment statement
    public static Date getDate(int seconds) {
        return new Date(seconds * 1000L); // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        return new Date(seconds * 1000L); // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    }

    // Mutant 2: Duplicated assignment statement with different variable name
    public static Date getDate(int seconds) {
        return new Date(seconds * 1000L); // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
        return new Date(seconds * 1000L); // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    }
}