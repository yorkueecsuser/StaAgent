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

    // unreachable if-else statement mutant
    public static boolean getCondition() {
        return false;
    }

    public static void unreachableIfElse() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Reachable branch");
        } else {
            System.out.println("Unreachable branch");
        }
    }
}