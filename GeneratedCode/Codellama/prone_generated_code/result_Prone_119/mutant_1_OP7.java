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

// Unreachable while loop mutant
class NonFinalCompileTimeConstantUnreachableWhileLoop {
    public static void main(String[] args) {
        System.out.println(f(10)); // BUG: NonFinalCompileTimeConstant
    }

    public static int f(@Generated("f") int x) {
        x = x + 1; // BUG: NonFinalCompileTimeConstant
        while (false) {
            // code that will never be executed
        }
        return x;
    }

    public static void showBug() {
        System.out.println(f(10));
    }
}