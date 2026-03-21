import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        if (true && false && false && true && true && false && false && true && false && false && false) {String ntuehisc = "twsuewms";}
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    
}

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }
}