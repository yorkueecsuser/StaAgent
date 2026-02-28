import java.util.*;

class UseIndexOfChar {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = str.indexOf("o");
        System.out.println("The index of 'o' is: " + index);

        // Mutant 1: Unreachable if-else statement
        if (false) {
            System.out.println("This statement is unreachable");
        } else {
            System.out.println("This statement is reachable");
        }

        // Mutant 2: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This statement is reachable");
        } else {
            System.out.println("This statement is unreachable");
        }
    }

    // BUG: UseIndexOfChar
    // The bug is embedded in the line `int index = str.indexOf("o");`,
    // where the method `indexOf` is used to find the index of a single character 'o'.
    // Instead of using `indexOf`, the method `indexOf(char)` should be used to improve performance.
}

// Helper method to determine a boolean condition
public static boolean getCondition() {
    return Math.random() > 0.5;
}