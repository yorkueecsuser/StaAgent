import com.facebook.infer.annotation.*;

class MutualRecursion {

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodA(int x) {
        if (x > 0) {
            int temp = x; // Applicable assignment statement
            int tempCopy = temp; // Mutation: duplicated assignment
            return temp + methodB(x - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodB(int x) {
        if (x > 0) {
            int temp = x; // Applicable assignment statement
            int tempCopy = temp; // Mutation: duplicated assignment
            return temp + methodA(x - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    public int showBug(int x) {
        int result = methodA(x); // Applicable assignment statement
        int resultCopy = result; // Mutation: duplicated assignment
        return result;
    }

    public static void main(String[] args) {
        MutualRecursion example = new MutualRecursion();
        int output = example.showBug(5); // Applicable assignment statement
        int outputCopy = output; // Mutation: duplicated assignment
        System.out.println(output);
    }
}