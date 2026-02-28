import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;
        int n_mutant = n; // Mutant Code: Duplication operator with variable 'n'
        int m = n + 3;
        System.out.println(m);
    }
}