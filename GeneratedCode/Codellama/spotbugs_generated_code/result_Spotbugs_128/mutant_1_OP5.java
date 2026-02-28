import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        System.out.println("Buggy shift operation: " + shift(40, 32));
        System.out.println("Correct shift operation: " + shift(32, 40));
    }

    public static int shift(int value, int amount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << amount;
    }

    public static int unreachableSwitch(int value) {
        int result = 0;
        switch (value) {
            case 1:
                result = 1;
                break;
            case 2:
                result = 2;
                break;
            case 3:
                result = 3;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    public static boolean getCondition() {
        return false;
    }

    public static int getValue() {
        return 0;
    }
}