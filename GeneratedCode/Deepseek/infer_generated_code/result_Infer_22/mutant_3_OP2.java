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
            return x * factorial1(x-1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }

    // Mutant Code: Duplicated factorial2() method
    public int factorial2_mutant(int x) {
        if (x > 0) {
            return x * factorial1_mutant(x-1); // Duplicated Mutant
        } else {
            return 1;
        }
    }

    public int showBug() {
        return factorial1(5);
    }

    // Mutant Code: Duplicated factorial1() method
    public int factorial1_mutant(int x) {
        if (x > 0) {
            return x * factorial2_mutant(x-1); // Duplicated Mutant
        } else {
            return 1;
        }
    }
}