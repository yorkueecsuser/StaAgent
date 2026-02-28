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

    // Unreachable switch statement mutation
    public static void unreachableSwitchStatement(int value) {
        switch (value) {
            case 1:
                // Code that is never executed
                break;
            default:
                // Code that is never executed
                break;
        }
    }
}