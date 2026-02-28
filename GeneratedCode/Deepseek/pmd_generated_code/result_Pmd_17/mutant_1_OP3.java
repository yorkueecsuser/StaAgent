import java.util.Arrays;

class AvoidMultipleUnaryOperators {

    public int showBug() {

        boolean condition = true;

        // BUG: AvoidMultipleUnaryOperators
        if (condition) {
            int i = - -1;
            return i;
        } else {
            return 1;
        }
    }

    public boolean getCondition() {
        return false;
    }
}