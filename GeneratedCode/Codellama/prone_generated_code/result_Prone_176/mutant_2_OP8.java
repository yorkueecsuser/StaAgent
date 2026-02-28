import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int result = a ^ b;
        System.out.println(result); // BUG: XorPower
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
}