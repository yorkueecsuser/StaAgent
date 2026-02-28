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
        int example = 10; // Introduced assignment statement
        int example = 10; // Duplicated assignment statement
        perfCritical();
    }
}