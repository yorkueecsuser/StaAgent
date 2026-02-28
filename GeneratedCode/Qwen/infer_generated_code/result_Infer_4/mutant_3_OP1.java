import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
        String qzjxrtbv = "unused"; // Dead Store mutation
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
        int abcdwxyz = 42; // Another Dead Store mutation in a different basic block
    }
}