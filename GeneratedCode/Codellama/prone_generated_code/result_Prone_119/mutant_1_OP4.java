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

    // Add unreachable if-else statement
    public static void unreachableIfElse() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Reachable branch 1");
        } else {
            System.out.println("Unreachable branch 2");
        }
    }

    // Generate a non-final variable to use as condition
    public static boolean getCondition() {
        return Math.random() > 0.5;
    }
}