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
        boolean rcfcfpdl = false;while (rcfcfpdl && false && true && false && false && true && false && true && false && true && false && false) {double oyjqzocq = -12767755;}
        System.out.println(f(10));
    
}
}