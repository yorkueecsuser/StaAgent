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

// Mutant 1: Renaming variable "input" to "str"
class BugExample {
    public static void main(String[] args) {
        String str = "123";
        int result = calculate(str); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}

// Mutant 2: Renaming variable "result" to "res"
class BugExample {
    public static void main(String[] args) {
        String input = "123";
        int res = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(res);
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}