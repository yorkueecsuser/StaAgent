import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
        String qzjfnxrd = "unused"; // Dead Store Mutation
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
        int klmnopqr = 42; // Dead Store Mutation
    }
}