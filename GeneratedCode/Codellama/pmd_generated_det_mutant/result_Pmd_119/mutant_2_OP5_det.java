import java.util.*;

class UseIndexOfChar {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int dpnpfbvl = 0;switch  (dpnpfbvl) {case 1:boolean mrhltcrg = true;break;default:double zmlcchcc = 852843615;break;}
        int index = str.indexOf("o");
        System.out.println("The index of 'o' is: " + index);
    
}

    // BUG: UseIndexOfChar
    // The bug is embedded in the line `int index = str.indexOf("o");`,
    // where the method `indexOf` is used to find the index of a single character 'o'.
    // Instead of using `indexOf`, the method `indexOf(char)` should be used to improve performance.
}