import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower
        boolean condition = getCondition();
        if (condition) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Unreachable for loop");
            }
        }
    }

    public static int showBug(int x, int y) {
        int result = x ^ y;
        boolean condition = getCondition();
        if (condition) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Unreachable for loop");
            }
        }
        return result;
    }

    private static boolean getCondition() {
        return false;
    }
}