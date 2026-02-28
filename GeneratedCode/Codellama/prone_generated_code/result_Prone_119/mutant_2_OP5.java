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

    // Unreachable switch statement mutant
    public static int f(int x) {
        switch (0) {
            case 1:
                x = x + 1;
                break;
            default:
                x = x + 2;
                break;
        }
        return x;
    }
}