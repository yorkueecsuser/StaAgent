// BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)

import java.util.Arrays;

class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int tjmeguef = 0;switch  (tjmeguef) {case 1:float uudfknnk = -131125733;break;default:byte fbkmlvzt = -77;break;}
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
        }
    
}
}