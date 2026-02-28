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

    // Mutant code with renaming
    @PerformanceCritical
    void perfCriticalMutant() {
        expensiveMutant(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }

    @Expensive
    void expensiveMutant() {}

    public void showBugMutant() {
        perfCriticalMutant();
    }
}