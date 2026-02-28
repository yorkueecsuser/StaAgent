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
            System.out.println("This is an unreachable branch.");
        }
        
        return array.length;
    }

    private boolean getUnreachableCondition() {
        return false; // This method will always return false, making the if branch unreachable
    }
}