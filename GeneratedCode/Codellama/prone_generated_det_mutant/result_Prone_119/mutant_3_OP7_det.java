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
        boolean gmruxfuj = false;while (gmruxfuj && false && false && true && true && false && false && true && false && false && true && false) {float qjpdphdm = -516568248;}
        System.out.println(f(10));
    
}
}