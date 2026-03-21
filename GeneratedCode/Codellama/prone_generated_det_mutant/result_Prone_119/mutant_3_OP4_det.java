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
        if (false && true && true && false && true && true && true && true && false && true && false) {short hstohkpp = -8957;}else{byte htogcnwr = 74;}
        System.out.println(f(10));
    
}
}