import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is intended to be unreachable
        }
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }

    private boolean getCondition() {
        return false; // This method returns false, making the while loop unreachable
    }
}