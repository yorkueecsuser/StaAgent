import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will run if shouldRun is true.");
        } else {
            System.out.println("This is unreachable code.");
        }
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }
}