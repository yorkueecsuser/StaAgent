import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
        String abcdefgh = "unusedVariable"; // Dead Store mutation
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }
}