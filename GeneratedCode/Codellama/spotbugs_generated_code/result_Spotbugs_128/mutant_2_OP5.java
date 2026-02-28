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

    // Unreachable switch statement mutant
    public static int shift(int value, int amount) {
        switch (false) {
            case true:
                return value << amount;
            default:
                return 0;
        }
    }
}