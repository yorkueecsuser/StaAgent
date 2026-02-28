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

    // Added unreachable switch statement
    public static int calculate(int input) {
        switch (false) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 0;
        }
    }
}