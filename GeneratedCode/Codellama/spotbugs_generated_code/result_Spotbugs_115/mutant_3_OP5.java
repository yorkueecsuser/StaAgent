import java.util.*;

class ICAST_INT_2_LONG_AS_INSTANT {
    public static void main(String[] args) {
        int seconds = 100;
        Date date = getDate(seconds);
        System.out.println(date);
    }

    public static Date getDate(int seconds) {
        return new Date(seconds * 1000L);
    }
}

// Unreachable Switch Statement Mutant
class ICAST_INT_2_LONG_AS_INSTANT_Mutant {
    public static void main(String[] args) {
        int seconds = 100;
        Date date = getDate(seconds);
        System.out.println(date);
    }

    public static Date getDate(int seconds) {
        switch (0) { // always evaluate to false, making the switch statement unreachable
            case 1:
                return new Date(seconds * 1000L);
            default:
                return new Date(0L); // to avoid unreachable statement error
        }
    }
}