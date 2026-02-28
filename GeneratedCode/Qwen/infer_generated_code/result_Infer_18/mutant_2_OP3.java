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
        
        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is an unreachable block.");
        }
        
        return array.length;
    }

    private boolean getUnreachableCondition() {
        // This method returns a condition that is always false at runtime
        return false;
    }
}