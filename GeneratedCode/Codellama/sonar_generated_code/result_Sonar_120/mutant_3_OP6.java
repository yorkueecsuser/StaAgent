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

    // Inserted unreachable for loop
    public static void unreachableForLoop() {
        for (int i = 0; false; i++) {
            // This code is unreachable
        }
    }
}