import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }

    @Expensive
    void expensive() {}

    public void showBug() {
        int temp = 0; // Introducing a local variable assignment for demonstration
        temp = 0;     // Duplicating the assignment statement
        perfCritical();
    }
}