import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        boolean ogbuhihy = false;while (ogbuhihy && true && false && true && false && false && false && false && true && false && true && false) {byte daxeotoo = -57;}
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    
}

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }
}