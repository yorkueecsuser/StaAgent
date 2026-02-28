import com.facebook.infer.annotation.*;

class AllocNegativeSizeExample {

    public static void main(String[] args) {
        AllocNegativeSizeExample example = new AllocNegativeSizeExample();
        example.showBug();
    }

    @PerformanceCritical
    public int showBug() {
        int n = Math.random() > 0.5? 3 : -5; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
        int[] array = new int[n];
        
        // Inserting an unreachable if-else branch
        boolean shouldRun = false; // This variable ensures the branch is unreachable
        if (shouldRun) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This will always be printed");
        }
        
        return array.length;
    }
}