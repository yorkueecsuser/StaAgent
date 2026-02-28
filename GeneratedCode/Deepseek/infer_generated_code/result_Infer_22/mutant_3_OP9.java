import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;
import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
@Expensive
@PerformanceCritical
class MutualRecursionCycleBug {
    public int factorial1(int x) {
        int i = 0;
        int result = 1;
        do {
            result *= i;
            i++;
        } while (i <= x);
        return result;
    }

    public int factorial2(int x) {
        int i = 0;
        int result = 1;
        do {
            result *= i;
            i++;
        } while (i <= x);
        return result;
    }

    public int showBug() {
        return factorial1(5);
    }
}