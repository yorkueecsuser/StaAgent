import java.util.Arrays;
import javax.annotation.processing.Generated;

class NonFinalCompileTimeConstant {
    public static void main(String[] args) {
        System.out.println(f(10)); // BUG: NonFinalCompileTimeConstant
    }

    public static int f(@Generated("f") int x) {
        x = x + 1; // BUG: NonFinalCompileTimeConstant
        x = x + 1; // Mutant 1: Duplication of assignment statement
        return x;
    }

    public static void showBug() {
        System.out.println(f(10));
    }
}