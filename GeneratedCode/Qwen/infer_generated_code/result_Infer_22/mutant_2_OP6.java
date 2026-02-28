import com.facebook.infer.annotation.*;

class MutualRecursion {

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodA(int x) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop will never execute because conditionFor is always false
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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop will never execute because conditionFor is always false
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
        return false; // This method ensures the condition is dynamically determined but always false
    }
}