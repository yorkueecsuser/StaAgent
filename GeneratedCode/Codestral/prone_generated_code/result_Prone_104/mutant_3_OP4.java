import java.lang.Math;

class MathRoundIntLongBug {

    public int showBug(long number) {
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // Unreachable if-else statement mutant
            return Integer.MAX_VALUE;
        } else {
            // Original code
            return Math.round(number);
        }
    }

    private boolean getCondition() {
        // This method simulates a dynamically determined condition
        return false;
    }
}