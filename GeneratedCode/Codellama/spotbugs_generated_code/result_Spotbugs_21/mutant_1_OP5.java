// BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)

import java.util.Arrays;

class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
        }
    }
}

// Unreachable switch statement mutation
class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
        }
        
        // Unreachable switch statement
        int a = 0;
        switch (a) {
            case 1: // Unreachable code
                System.out.println("Hello, world!");
                break;
            case 2: // Unreachable code
                System.out.println("Goodbye, world!");
                break;
            default: // Unreachable code
                System.out.println("Default case");
                break;
        }
    }
}