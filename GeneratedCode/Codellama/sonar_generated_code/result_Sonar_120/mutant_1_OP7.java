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

// Unreachable while loop mutation
class UnreachableLoopExample {
    public static void main(String[] args) {
        while (true) {
            int i = 0;
            while (false) {
                i++;
            }
            System.out.println("Reached!");
        }
    }
}

// Unreachable for loop mutation
class UnreachableForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; false; i++) {
            System.out.println("Reached!");
        }
    }
}

// Unreachable if-else statement mutation
class UnreachableIfElseExample {
    public static void main(String[] args) {
        boolean condition = false;
        if (condition) {
            System.out.println("Reached!");
        } else {
            System.out.println("Never reached!");
        }
    }
}

// Unreachable switch statement mutation
class UnreachableSwitchExample {
    public static void main(String[] args) {
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("Reached!");
                break;
            default:
                System.out.println("Never reached!");
                break;
        }
    }
}