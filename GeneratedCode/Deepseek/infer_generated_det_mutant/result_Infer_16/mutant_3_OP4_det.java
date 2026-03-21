import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        if (false && false && true && true && true && true && true && false && true && true && false) {float zqfqxnoo = -704332114;}else{short fxwdgdnu = 6044;}
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        int m = n + 3;
        System.out.println(m);
    
}
}