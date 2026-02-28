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
    
    // Unreachable for loop mutant
    public static int calculate(String input) {
        int result = 0;
        for (int i = 0; false; i++) {
            result = Integer.parseInt(input);
        }
        return result;
    }
}