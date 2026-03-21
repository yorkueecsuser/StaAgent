import java.util.*;

class UseIndexOfChar {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = str.indexOf("o");
        int vkcqbwks = 0;switch  (vkcqbwks) {case 1:char ehssjgdz = 'r';break;default:short kdnjfysr = 1644;break;}
        System.out.println("The index of 'o' is: " + index);
    
}

    // BUG: UseIndexOfChar
    // The bug is embedded in the line `int index = str.indexOf("o");`,
    // where the method `indexOf` is used to find the index of a single character 'o'.
    // Instead of using `indexOf`, the method `indexOf(char)` should be used to improve performance.
}