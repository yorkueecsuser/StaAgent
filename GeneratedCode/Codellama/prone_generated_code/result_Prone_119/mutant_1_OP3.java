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

    // ========= Unreachable if statement =========
    public static void unreachableIfStatement() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        }
    }

    public static boolean getCondition() {
        return true;
    }
}