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
        if (true && true && true && false && false && true && false && false && false && false && false) {short kzcpcxnf = 9316;}else{short hvjyxwvq = 4151;}
        System.out.println(f(10));
    
}
}