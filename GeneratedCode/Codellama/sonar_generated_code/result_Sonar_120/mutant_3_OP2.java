import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        int result2 = calculate(input); // Mutation Operator: Duplication
        System.out.println(result);
        System.out.println(result2);
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}