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
        for  (int mcvcloub = 0; mcvcloub < 0; mcvcloub++) {short rozxxsuy = 5227;}
        System.out.println(m);
    
}
}