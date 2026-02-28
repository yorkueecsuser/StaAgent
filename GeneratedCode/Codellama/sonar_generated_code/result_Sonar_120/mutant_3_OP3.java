import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }

    public static boolean getCondition() {
        // This method always returns false, making the inserted if branch unreachable
        return false;
    }

    public static void unreachableIfStatement() {
        if (getCondition()) {
            // This code is never executed
            System.out.println("This is an unreachable branch");
        }
    }
}