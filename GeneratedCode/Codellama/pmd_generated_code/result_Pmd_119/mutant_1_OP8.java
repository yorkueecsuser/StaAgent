import java.util.*;

class UseIndexOfChar {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = str.indexOf("o");
        System.out.println("The index of 'o' is: " + index);
    }

    // BUG: UseIndexOfChar
    // The bug is embedded in the line `int index = str.indexOf("o");`,
    // where the method `indexOf` is used to find the index of a single character 'o'.
    // Instead of using `indexOf`, the method `indexOf(char)` should be used to improve performance.

    // MUTANT: Renaming
    // The variable `index` has been renamed to `idx`.
    // The new name of the variable will be in the form of [a-z].
    public static void main(String[] args) {
        String str = "Hello, World!";
        int idx = str.indexOf("o");
        System.out.println("The index of 'o' is: " + idx);
    }
}