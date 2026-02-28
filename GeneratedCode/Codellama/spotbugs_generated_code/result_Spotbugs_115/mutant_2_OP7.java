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

// Unreachable while loop mutation operator
boolean conditionWhile = getCondition();
while (conditionWhile) {
    // This code is unreachable and will never be executed
    // The condition of the inserted loop is always false to make it unreachable
    break;
}

// Method to get the condition for the while loop
public static boolean getCondition() {
    return false;
}