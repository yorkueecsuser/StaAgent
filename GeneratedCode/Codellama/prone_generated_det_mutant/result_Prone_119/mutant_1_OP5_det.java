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
        int mektilkr = 0;switch  (mektilkr) {case 1:String bcbhtalm = "cioebabi";break;default:long qtuvngmj = -822489461;break;}
        System.out.println(f(10));
    
}
}