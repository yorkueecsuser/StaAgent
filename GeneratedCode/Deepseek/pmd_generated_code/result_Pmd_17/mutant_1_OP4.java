import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    private boolean shouldRun;

    public AvoidMultipleUnaryOperators(boolean shouldRun) {
        this.shouldRun = shouldRun;
    }

    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        if (this.shouldRun) {
            // Unreachable code
            i = 0;
        } else {
            i = 1;
        }
        return i;
    }
}