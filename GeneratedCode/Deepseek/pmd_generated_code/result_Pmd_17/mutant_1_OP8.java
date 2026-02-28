import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    // Mutant Code
    public int showBug() {
        // Mutated BUG: AvoidMultipleUnaryOperators
        int a = -1;
        int b = a;
        return b;
    }
}