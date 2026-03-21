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
        int anravuif = 0;switch  (anravuif) {case 1:long nmvpmjmo = -206167380;break;default:short pxliotfs = -3889;break;}
        System.out.println(f(10));
    
}
}