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
        
        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() returns false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will always execute
            System.out.println("This is the reachable else block.");
        }
        
        return array.length;
    }

    private boolean getCondition() {
        // Always returns false, making the if block unreachable
        return false;
    }
}