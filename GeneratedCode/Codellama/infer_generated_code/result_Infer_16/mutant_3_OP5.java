import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1

        // Unreachable switch statement mutation
        int unreachableSwitchValue = -1;
        switch (unreachableSwitchValue) {
            case 1:
                // Unreachable code
                System.out.println("Hello, world!");
                break;
            case 2:
                // Unreachable code
                System.out.println("Goodbye, world!");
                break;
            default:
                // Unreachable code
                System.out.println("Default case");
                break;
        }
    }
}