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
}

// Mutant 1: Unreachable if-else statement
public static void main(String[] args) {
    int x = 2;
    int y = 2;
    int result = x ^ y;
    System.out.println(result);
    if (false) {
        // Unreachable code
        System.out.println("Unreachable code");
    } else {
        // Reachable code
        System.out.println("Reachable code");
    }
}

// Mutant 2: Unreachable if-else statement
public static int showBug(int x, int y) {
    return x ^ y;
    if (false) {
        // Unreachable code
        System.out.println("Unreachable code");
    } else {
        // Reachable code
        System.out.println("Reachable code");
    }
}