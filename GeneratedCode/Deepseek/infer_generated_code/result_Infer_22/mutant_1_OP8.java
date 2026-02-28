import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;
import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
@Expensive
@PerformanceCritical
class MutualRecursionCycleBug {
    public int factorial1(int x) {
        if (x > 0) {
            return x * factorial2(x-1);
        } else {
            return 1;
        }
    }

    public int factorial2(int q) { // Renaming factorial2 to q
        if (q > 0) {
            return q * factorial1(q-1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }

    public int showBug() {
        return factorial1(5);
    }
}