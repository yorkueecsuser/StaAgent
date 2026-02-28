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
        int localVar = 10; // Introduced local variable for demonstration
        localVar = 10;      // Duplicated assignment statement
        perfCritical();
    }
}