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

    // Mutant code with renaming of variable 'x' in methodA to 'a'
    @PerformanceCritical
    public int methodA_mutant(int a) {
        if (a > 0) {
            return a + methodB(a - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    // Mutant code with renaming of variable 'x' in methodB to 'b'
    @PerformanceCritical
    public int methodB_mutant(int b) {
        if (b > 0) {
            return b + methodA(b - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    public int showBug_mutant(int x) {
        return methodA_mutant(x);
    }

    public static void main_mutant(String[] args) {
        MutualRecursion example = new MutualRecursion();
        System.out.println(example.showBug_mutant(5));
    }
}