import java.util.*;

class UseIndexOfChar {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = str.indexOf("o");
        System.out.println("The index of 'o' is: " + index);

        // Mutant 1: Insert unreachable if statement
        if (false) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }

    // BUG: UseIndexOfChar
    // The bug is embedded in the line `int index = str.indexOf("o");`,
    // where the method `indexOf` is used to find the index of a single character 'o'.
    // Instead of using `indexOf`, the method `indexOf(char)` should be used to improve performance.
}