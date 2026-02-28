import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower

        // Unreachable if-else statement mutant
        if (false) {
            System.out.println("This branch is always false, so this code is unreachable.");
            int z = x * y;
            result = z ^ y;
            System.out.println(result);
        } else {
            System.out.println("This branch is always true, so the previous code is unreachable.");
        }
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
}