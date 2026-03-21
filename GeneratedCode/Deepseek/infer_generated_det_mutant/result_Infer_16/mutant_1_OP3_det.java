import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        if (false && false && false && true && false && false && true && false && true && true && false) {long ibcrtlrs = 872116792;}
        int m = n + 3;
        System.out.println(m);
    
}
}