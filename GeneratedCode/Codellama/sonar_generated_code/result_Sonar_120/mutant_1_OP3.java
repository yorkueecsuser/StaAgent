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

// Mutated Code: Adds unreachable if statement to calculate() method
class BugExampleMutant1 {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    }

    public static int calculate(String input) {
        if (false) {
            return 0;
        }
        return Integer.parseInt(input);
    }
}

// Mutated Code: Adds unreachable if statement to main() method
class BugExampleMutant2 {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);

        if (false) {
            System.out.println("Unreachable code");
        }
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}

// Mutated Code: Adds unreachable while loop to calculate() method
class BugExampleMutant3 {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    }

    public static int calculate(String input) {
        while (false) {
            return 0;
        }
        return Integer.parseInt(input);
    }
}

// Mutated Code: Adds unreachable for loop to main() method
class BugExampleMutant4 {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);

        for (int i = 0; false; i++) {
            System.out.println("Unreachable code");
        }
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}