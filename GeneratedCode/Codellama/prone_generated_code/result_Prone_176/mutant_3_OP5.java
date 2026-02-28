import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower

        // Unreachable switch statement mutant
        int unreachableSwitchValue = 0;
        switch (unreachableSwitchValue) {
            case 1:
                // unreachable code
                break;
            default:
                // unreachable code
                break;
        }
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
}