import com.facebook.infer.annotation.*;

class MutualRecursion {

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodA(int x) {
        if (x > 0) {
            return x + methodB(x - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodB(int x) {
        if (x > 0) {
            return x + methodA(x - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    public int showBug(int x) {
        return methodA(x);
    }

    public static void main(String[] args) {
        MutualRecursion example = new MutualRecursion();
        System.out.println(example.showBug(5));
    }

    // Mutated code
    // Renaming variable 'x' in methodA to 'a'
    @PerformanceCritical
    public int methodA_mutated(int a) {
        if (a > 0) {
            return a + methodB(a - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    // Renaming variable 'x' in methodB to 'b'
    @PerformanceCritical
    public int methodB_mutated(int b) {
        if (b > 0) {
            return b + methodA(b - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    public int showBug_mutated(int x) {
        return methodA_mutated(x);
    }

    public static void main_mutated(String[] args) {
        MutualRecursion example = new MutualRecursion();
        System.out.println(example.showBug_mutated(5));
    }
}