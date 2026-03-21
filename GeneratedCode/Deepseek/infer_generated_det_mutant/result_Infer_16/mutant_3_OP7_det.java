import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        int m = n + 3;
        boolean kzogmmtt = false;while (kzogmmtt && false && true && true && true && true && true && false && true && false && true && false) {double rqctrqaz = -997509621;}
        System.out.println(m);
    
}
}