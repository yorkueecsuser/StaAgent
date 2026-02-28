import java.util.Arrays;
import javax.annotation.processing.Generated;

class NonFinalCompileTimeConstant {
    public static void main(String[] args) {
        System.out.println(f(10)); // BUG: NonFinalCompileTimeConstant
    }

    public static int f(@Generated("f") int x) {
        x = x + 1; // BUG: NonFinalCompileTimeConstant
        return x;
    }

    public static void showBug() {
        System.out.println(f(10));
    }
}

// Unreachable switch statement mutant
class UnreachableSwitchStatement {
    public static void main(String[] args) {
        System.out.println(f(10)); // BUG: NonFinalCompileTimeConstant
    }

    public static int f(@Generated("f") int x) {
        x = x + 1; // BUG: NonFinalCompileTimeConstant
        return x;
    }

    public static void showBug() {
        System.out.println(f(10));
    }

    public static void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("This statement is unreachable.");
                break;
            default:
                // Reachable code
                System.out.println("This statement is reachable.");
                break;
        }
    }
}

// Get value method
public static int getValue() {
    return 0;
}