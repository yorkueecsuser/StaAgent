import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        if (true && false && false && false && false && false && true && false && false && false && false) {byte eajmidfd = 101;}
        int m = n + 3;
        System.out.println(m);
    
}
}