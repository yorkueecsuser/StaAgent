import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        System.out.println(m);

        // Mutated code
        boolean alwaysFalse = false;
        switch (n) {
            case 0:
                System.out.println("unreachable");
                break;
            default:
                break;
        }
    }
}