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

/* Renaming mutant 1 */
class NonFinalCompileTimeConstant {
    public static void main(String[] args) {
        System.out.println(f(10)); // BUG: NonFinalCompileTimeConstant
    }

    public static int f(@Generated("f") int z) {
        z = z + 1; // BUG: NonFinalCompileTimeConstant
        return z;
    }

    public static void showBug() {
        System.out.println(f(10));
    }
}

/* Renaming mutant 2 */
class NonFinalCompileTimeConstant {
    public static void main(String[] args) {
        System.out.println(f(10)); // BUG: NonFinalCompileTimeConstant
    }

    public static int f(@Generated("f") int y) {
        y = y + 1; // BUG: NonFinalCompileTimeConstant
        return y;
    }

    public static void showBug() {
        System.out.println(f(10));
    }
}