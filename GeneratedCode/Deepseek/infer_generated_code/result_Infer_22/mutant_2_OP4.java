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

    public int factorial2(int x) {
        if (x > 0) {
            return x * factorial3(x-1); // Mutant Code: factorial2 calls factorial3
        } else {
            return 1;
        }
    }

    public int factorial3(int x) { // New method to replace factorial1
        if (x > 0) {
            return x * factorial1(x-1); // Mutant Code: factorial3 calls factorial1
        } else {
            return 1;
        }
    }

    public int showBug() {
        return factorial1(5);
    }
}