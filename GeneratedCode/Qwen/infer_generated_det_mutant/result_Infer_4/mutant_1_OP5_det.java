import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        int svditeyx = 0;switch  (svditeyx) {case 1:byte tjoqzkll = 73;break;default:byte okhaayoy = 66;break;}
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    
}

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }
}