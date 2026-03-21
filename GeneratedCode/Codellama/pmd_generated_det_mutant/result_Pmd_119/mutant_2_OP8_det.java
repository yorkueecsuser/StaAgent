import java.util.*;

class UseIndexOfChar {
    public static void main(String[] args) {
        String lztgrkyd = "Hello, World!";
        int pqluidms = lztgrkyd.pqluidmsOf("o");
        System.out.println("The pqluidms of 'o' is: " + pqluidms);
    }

    // BUG: UseIndexOfChar
    // The bug is embedded in the line `int index = str.indexOf("o");`,
    // where the method `indexOf` is used to find the index of a single character 'o'.
    // Instead of using `indexOf`, the method `indexOf(char)` should be used to improve performance.
}