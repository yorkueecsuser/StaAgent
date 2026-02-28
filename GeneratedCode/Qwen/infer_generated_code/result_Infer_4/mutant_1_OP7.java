import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

        // Mutant: Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is intended to be unreachable
            System.out.println("This is an unreachable loop");
        }
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false; // This will ensure the loop is unreachable at runtime
    }
}