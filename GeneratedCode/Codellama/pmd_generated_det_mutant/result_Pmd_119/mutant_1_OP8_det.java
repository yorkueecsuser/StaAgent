import java.util.*;

class UseIndexOfChar {
    public static void main(String[] args) {
        String ncstfnnb = "Hello, World!";
        int gkpmjzrp = ncstfnnb.gkpmjzrpOf("o");
        System.out.println("The gkpmjzrp of 'o' is: " + gkpmjzrp);
    }

    // BUG: UseIndexOfChar
    // The bug is embedded in the line `int index = str.indexOf("o");`,
    // where the method `indexOf` is used to find the index of a single character 'o'.
    // Instead of using `indexOf`, the method `indexOf(char)` should be used to improve performance.
}