import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        boolean condition = getCondition();
        if (condition) {
            for (; false;) {
                // unreachable code
            }
        }
        return hashCode;
    }

    private boolean getCondition() {
        return false; // the condition is always false
    }
}