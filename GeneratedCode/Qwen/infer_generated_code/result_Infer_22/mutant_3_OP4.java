import com.facebook.infer.annotation.*;

class MutualRecursion {

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodA(int x) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (getFalseCondition()) {
                return x * 2; // This branch is unreachable
            } else {
                return x * 3; // This branch is also unreachable
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
            if (getFalseCondition()) {
                return x * 2; // This branch is unreachable
            } else {
                return x * 3; // This branch is also unreachable
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
        return true; // This can be any dynamic condition
    }

    private boolean getFalseCondition() {
        return false; // This will ensure the if-else branches are unreachable
    }
}