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
        System.out.println(m);
        
        // Added a simple for loop
        for (int i = 0; i < 3; i++) {
            if (i == 3) {
                break;
            }
        }
    }
}