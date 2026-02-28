// BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)

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

// Mutated code below

class MutatedCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
            switch (result) {
                case 0:
                    // Unreachable code
                    System.out.println("Unreachable code executed");
                    break;
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable code executed");
                    break;
                default:
                    // Default code
                    System.out.println("Default code executed");
                    break;
            }
        }
    }
}