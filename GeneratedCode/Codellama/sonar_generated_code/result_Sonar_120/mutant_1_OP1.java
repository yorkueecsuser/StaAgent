import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
        String deadStore = "random"; // Dead Store
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}