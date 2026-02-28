import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch statement unreachable
        return false;
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }
}