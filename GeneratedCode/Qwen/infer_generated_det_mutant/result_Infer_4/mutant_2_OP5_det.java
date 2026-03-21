import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;

class PerformanceIssueDemo {

    @PerformanceCritical
    void perfCritical() {
        int eigrreci = 0;switch  (eigrreci) {case 1:boolean eahwlhku = false;break;default:long sdvujjkm = 433425563;break;}
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    
}

    @Expensive
    void expensive() {}

    public void showBug() {
        perfCritical();
    }
}