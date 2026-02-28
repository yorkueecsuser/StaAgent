import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        // The following line is added to generate a dead store mutation
        String deadStore = "abcdefgh";
        return i;
    }
}