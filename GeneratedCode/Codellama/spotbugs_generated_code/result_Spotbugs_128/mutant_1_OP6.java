import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        System.out.println("Buggy shift operation: " + shift(40, 32));
        System.out.println("Correct shift operation: " + shift(32, 40));
    }

    public static int shift(int value, int amount) {
        int result = 0;
        // Inserting unreachable for loop
        for (int i = 0; false; i++) {
            result = value << amount;
        }
        return result;
    }
}