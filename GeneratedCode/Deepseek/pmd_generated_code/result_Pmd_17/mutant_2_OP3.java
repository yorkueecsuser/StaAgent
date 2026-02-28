import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        boolean condition = false;
        if (condition) {
            // BUG: AvoidMultipleUnaryOperators
            int i = - -1;
            return i;
        } else {
            // This branch will always be executed, since the condition is always false.
            int i = 1;
            return i;
        }
    }
}