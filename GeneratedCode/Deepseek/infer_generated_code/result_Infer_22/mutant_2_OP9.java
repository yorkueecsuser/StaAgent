import com.facebook.infer.annotation.Expensive;
import com.facebook.infer.annotation.PerformanceCritical;
import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
@Expensive
@PerformanceCritical
class MutualRecursionCycleBug {
    public int factorial1(int x) {
        if (x > 0) {
            int result = 1;
            int i = x;
            do {
                result *= i;
                i--;
            } while(i > 0);

            return result;
        } else {
            return 1;
        }
    }

    public int factorial2(int x) {
        if (x > 0) {
            int result = 1;
            int i = x;
            do {
                result *= i;
                i--;
            } while(i > 0);

            return result;
        } else {
            return 1;
        }
    }

    public int showBug() {
        return factorial1(5);
    }
}