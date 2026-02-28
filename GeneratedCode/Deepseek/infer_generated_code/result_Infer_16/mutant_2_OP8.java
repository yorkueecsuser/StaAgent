import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int i = Integer.MAX_VALUE;// Mutated BUG: INTEGER_OVERFLOW_L1
        int m = i + 3;
        System.out.println(m);
    }
}