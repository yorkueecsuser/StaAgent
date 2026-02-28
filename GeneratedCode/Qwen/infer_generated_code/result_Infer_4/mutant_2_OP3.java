import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

        // Inserted unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }

    // Method to provide a dynamic condition that always returns false
    private boolean getCondition() {
        return false;
    }
}