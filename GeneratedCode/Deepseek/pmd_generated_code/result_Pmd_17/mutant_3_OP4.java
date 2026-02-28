import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        // Mutation: Unreachable if-else statement
        if (false) {
            // Unreachable code
            i = 1;
        } else {
            // Reachable code
            i = 0;
        }
        return i;
    }
}