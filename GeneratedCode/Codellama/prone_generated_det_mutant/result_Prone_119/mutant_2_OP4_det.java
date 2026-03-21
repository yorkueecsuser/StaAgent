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
        if (false && true && true && false && true && true && true && false && false && true && false) {short hruvhmzu = 3971;}else{double ifhepzwt = -742449962;}
        System.out.println(f(10));
    
}
}