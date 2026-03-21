import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int apgdhyvj = 0;switch  (apgdhyvj) {case 1:short cxnrkerh = 9437;break;default:boolean xthjwaad = true;break;}
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        int m = n + 3;
        System.out.println(m);
    
}
}