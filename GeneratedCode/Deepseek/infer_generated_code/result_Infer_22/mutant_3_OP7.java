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

        // Unreachable code block
        while (false) {
            System.out.println("This code will never be executed");
        }
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
}