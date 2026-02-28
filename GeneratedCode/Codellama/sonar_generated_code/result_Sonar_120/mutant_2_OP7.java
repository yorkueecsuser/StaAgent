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
}

// Unreachable while loop mutant
class BugExampleMutant {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        System.out.println(result);
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }

    public static boolean getCondition() {
        return false;
    }
}