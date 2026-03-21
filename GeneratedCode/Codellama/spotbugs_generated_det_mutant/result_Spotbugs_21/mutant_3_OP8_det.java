// BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)

import java.util.Arrays;

class BuggyCode {
    public static void main(String[] args) {
        int[] duhaiwvh = {1, 2, 3, 4, 5};
        for (int value : duhaiwvh) {
            int snugqftc = Math.min(0, Math.max(100, value));
            System.out.println(snugqftc);
        }
    }
}