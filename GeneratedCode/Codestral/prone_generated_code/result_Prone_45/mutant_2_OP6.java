class EqualsNaNBug {
    public boolean showBug(double num) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop mutation
            System.out.println("Unreachable code");
        }
        return num == Double.NaN; // BUG: EqualsNaN
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}