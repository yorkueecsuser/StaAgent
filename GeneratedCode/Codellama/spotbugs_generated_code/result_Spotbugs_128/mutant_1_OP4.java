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

    // Mutant code - Unreachable if-else statement
    public static int shift(int value, int amount) {
        boolean condition = getCondition();
        if (condition) {
            return value << amount;
        } else {
            return value >> amount;
        }
    }

    // Method to get random condition
    public static boolean getCondition() {
        Random rand = new Random();
        return rand.nextBoolean();
    }
}