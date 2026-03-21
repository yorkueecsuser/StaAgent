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
        int dqqbliva = 0;switch  (dqqbliva) {case 1:char evahmdmq = 'u';break;default:short dkyjuhkk = 8702;break;}
        System.out.println(f(10));
    
}
}