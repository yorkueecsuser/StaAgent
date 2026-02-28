import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower

        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
}