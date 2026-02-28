import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1; // original line
        return i; // original line
    }

    // Mutated code: Unreachable while loop
    public void unreachableWhileLoop() {
        boolean condition = false; // Non-final variable used as loop condition
        while (condition) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }
}