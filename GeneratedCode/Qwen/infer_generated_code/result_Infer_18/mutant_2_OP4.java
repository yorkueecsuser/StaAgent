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
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        } else {
            // Alternative code
            System.out.println("This is the alternative block.");
        }
        
        return array.length;
    }

    private boolean getCondition() {
        // Always return false to ensure the if block is unreachable
        return false;
    }
}