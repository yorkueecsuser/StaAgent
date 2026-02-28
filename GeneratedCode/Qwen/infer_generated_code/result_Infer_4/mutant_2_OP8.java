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
        perfCritical();
    }

    // Mutated code
    @PerformanceCritical
    void perfCriticalMutated() {
        a(); // Renamed 'expensive' to 'a'
    }

    @Expensive
    void a() {} // Renamed method 'expensive' to 'a'
}