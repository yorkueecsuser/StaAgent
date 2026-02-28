import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;
import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
@Expensive
@PerformanceCritical
class MutualRecursionCycleBug {
    public int factorial1(int x) {
        boolean condition = getCondition();
        if (condition) {
            if (x > 0) {
                return x * factorial2(x-1);
            } else {
                return 1;
            }
        }
        return 0;
    }

    public int factorial2(int x) {
        if (x > 0) {
            return x * factorial1(x-1);
        } else {
            return 1;
        }
    }

    public int showBug() {
        return factorial1(5);
    }

    private boolean getCondition() {
        // This method returns a non-final boolean variable, ensuring the condition is dynamically determined at runtime
        return true;
    }
}