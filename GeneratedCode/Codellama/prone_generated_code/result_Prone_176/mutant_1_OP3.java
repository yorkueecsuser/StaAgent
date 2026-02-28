import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower

        // Mutant if statement
        if (false) {
            System.out.println("This is an unreachable if statement");
        }
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
}