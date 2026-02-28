import com.facebook.infer.annotation.*;

class MutualRecursion {

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodA(int x) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (shouldRun &&!shouldRun) {
                return x * 2; // This will never be executed
            } else {
                return x / 2; // This will also never be executed
            }
        }
        if (x > 0) {
            return x + methodB(x - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodB(int x) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (shouldRun &&!shouldRun) {
                return x * 3; // This will never be executed
            } else {
                return x / 3; // This will also never be executed
            }
        }
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

    private boolean getCondition() {
        return true; // This method ensures the condition is dynamically determined at runtime
    }
}