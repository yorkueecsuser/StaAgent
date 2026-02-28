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

// Unreachable if statement mutation
class UnreachableIfStatement {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
            if (false) { // this branch is unreachable
                System.out.println("This statement is unreachable");
            }
        }
    }
}

// Another unreachable if statement mutation
class AnotherUnreachableIfStatement {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
            if (result > 100) { // this branch is unreachable
                System.out.println("This statement is unreachable");
            }
        }
    }
}