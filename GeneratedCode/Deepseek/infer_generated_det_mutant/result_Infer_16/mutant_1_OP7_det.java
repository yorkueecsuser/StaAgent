import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        boolean idmmkqjh = false;while (idmmkqjh && false && false && false && true && true && false && false && false && false && false && false) {float yliitoup = -569247931;}
        int m = n + 3;
        System.out.println(m);
    
}
}