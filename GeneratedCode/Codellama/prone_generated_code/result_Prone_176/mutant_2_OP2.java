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
// Mutant 1: Duplicate the assignment statement for x
int x = 2;
int y = 2;
int result = x ^ y;
System.out.println(result); // BUG: XorPower

// Mutant 2: Duplicate the assignment statement for y
int x = 2;
int y = 2;
int result = x ^ y;
System.out.println(result); // BUG: XorPower

// Mutant 3: Duplicate the assignment statement for result
int x = 2;
int y = 2;
int result = x ^ y;
int result = x ^ y;
System.out.println(result); // BUG: XorPower