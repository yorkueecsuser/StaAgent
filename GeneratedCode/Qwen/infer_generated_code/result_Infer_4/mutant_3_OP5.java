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
                // This case is unreachable because condition is never true
                System.out.println("This is unreachable");
                break;
            default:
                // Default case to ensure switch is not empty
                break;
        }
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition unreachable
        return false;
    }
}