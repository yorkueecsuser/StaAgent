import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        System.out.println("Buggy shift operation: " + shift(40, 32));
        System.out.println("Correct shift operation: " + shift(32, 40));
    }

    public static int shift(int value, int amount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << amount;
    }

    // Unreachable if statement
    public static int unreachableShift(int value, int amount) {
        if (false) {
            return value << amount;
        }
        return 0;
    }

    // Fix for unreachable if statement
    public static int reachableShift(int value, int amount) {
        boolean shouldShift = getCondition();
        if (shouldShift) {
            return value << amount;
        }
        return 0;
    }

    // Auxiliary method for unreachable if statement
    public static boolean getCondition() {
        return true;
    }
}