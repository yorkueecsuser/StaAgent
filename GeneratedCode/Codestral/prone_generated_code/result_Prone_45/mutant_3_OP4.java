class EqualsNaNBug {
    public boolean showBug(double num) {
        boolean falseCondition = isFalseCondition(); // Method call to avoid compile-time constants
        if (falseCondition) {
            // Unreachable if-else branch
            return true;
        } else {
            return num == Double.NaN; // Original code
        }
    }

    public boolean isFalseCondition() {
        return false; // Always returns false for the unreachable if-else branch
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}