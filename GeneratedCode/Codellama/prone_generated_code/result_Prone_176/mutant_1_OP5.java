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
        return x ^ y;
    }

    // Mutant code added for Unreachable switch statement mutation operator
    public static void unreachableSwitchStatement(int value) {
        switch (value) {
            case 1:
                System.out.println("This branch is unreachable!");
                break;
            case 2:
                System.out.println("This branch is also unreachable!");
                break;
            default:
                System.out.println("This is the default branch, which is always reachable.");
                break;
        }
    }
}