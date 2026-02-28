import com.facebook.infer.annotation.*;

class MutualRecursion {

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodA(int x) {
        if (x > 0) {
            int result = x + methodB(x - 1); // Original statement
            int resultCopy = x + methodB(x - 1); // Duplicated statement
            return result; // Return the original result
        } else {
            int result = 0; // Original statement
            int resultCopy = 0; // Duplicated statement
            return result; // Return the original result
        }
    }

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodB(int x) {
        if (x > 0) {
            int result = x + methodA(x - 1); // Original statement
            int resultCopy = x + methodA(x - 1); // Duplicated statement
            return result; // Return the original result
        } else {
            int result = 0; // Original statement
            int resultCopy = 0; // Duplicated statement
            return result; // Return the original result
        }
    }

    public int showBug(int x) {
        return methodA(x);
    }

    public static void main(String[] args) {
        MutualRecursion example = new MutualRecursion();
        System.out.println(example.showBug(5));
    }
}