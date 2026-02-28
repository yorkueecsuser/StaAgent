import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower
    }

    public static int showBug(int x, int y) {
        int result = x ^ y;
        return result;
    }

    public static int duplicated(int x, int y) {
        int result = x ^ y;
        return result;
    }
}