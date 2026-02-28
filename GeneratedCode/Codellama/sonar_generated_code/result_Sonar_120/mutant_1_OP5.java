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

// Unreachable switch statement mutant
class BugExampleMutant {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    }

    public static int calculate(String input) {
        switch (getCondition()) {
            case 0:
                return Integer.parseInt(input);
            default:
                break;
        }
    }

    private static int getCondition() {
        return 0;
    }
}