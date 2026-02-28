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

// Dead Store mutant
class DeadStore {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(x);
        y = 30;
        System.out.println(y);
    }
}