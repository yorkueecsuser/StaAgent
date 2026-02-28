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
}

// Renaming user-defined variables
class ICAST_INT_2_LONG_AS_INSTANT_Mutant {
    public static void main(String[] args) {
        int s = 100;
        Date date = getDate(s);
        System.out.println(date);
    }

    public static Date getDate(int s) {
        return new Date(s * 1000L); // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    }
}