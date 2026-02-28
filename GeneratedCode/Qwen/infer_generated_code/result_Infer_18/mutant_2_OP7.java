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
        
        // Introduced unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will never return true
        }
        
        return array.length;
    }

    private boolean getCondition() {
        // This method ensures the condition is dynamically determined at runtime
        return false;
    }
}