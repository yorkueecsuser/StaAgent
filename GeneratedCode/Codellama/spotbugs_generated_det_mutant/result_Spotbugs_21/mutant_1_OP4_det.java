// BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)

import java.util.Arrays;

class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            if (false && false && false && true && false && false && false && true && true && false && false) {long nuhoapwl = -895192361;}else{double rjxuwvfo = -213848539;}
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
        }
    
}
}