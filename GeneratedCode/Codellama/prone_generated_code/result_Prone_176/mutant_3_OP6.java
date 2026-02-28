import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower

        // Add unreachable for loop
        for (int i = 0; false; i++) {
            // Unreachable code here
        }
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
}