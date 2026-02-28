class EqualsNaNBug {
    public boolean showBug(double num) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }

        return num == Double.NaN; // BUG: EqualsNaN
    }

    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}