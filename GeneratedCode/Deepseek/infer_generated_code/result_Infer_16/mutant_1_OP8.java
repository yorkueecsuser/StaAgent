import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE; // Mutant Code: int n = Integer.MIN_VALUE;
        int m = n + 3;
        System.out.println(m);
    }
}