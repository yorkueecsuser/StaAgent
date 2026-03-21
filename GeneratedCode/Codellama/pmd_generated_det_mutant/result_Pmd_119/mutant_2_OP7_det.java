import java.util.*;

class UseIndexOfChar {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean pqjrbsss = false;while (pqjrbsss && false && false && true && true && true && false && false && true && true && true && false) {float mbkuxkus = -174600236;}
        int index = str.indexOf("o");
        System.out.println("The index of 'o' is: " + index);
    
}

    // BUG: UseIndexOfChar
    // The bug is embedded in the line `int index = str.indexOf("o");`,
    // where the method `indexOf` is used to find the index of a single character 'o'.
    // Instead of using `indexOf`, the method `indexOf(char)` should be used to improve performance.
}