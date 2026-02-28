import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

        // Mutant code starts here
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This is an unreachable if block.");
        } else {
            // This block is also intended to be unreachable
            System.out.println("This is an unreachable else block.");
        }
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will ensure the if-else block is unreachable at runtime
    }
}