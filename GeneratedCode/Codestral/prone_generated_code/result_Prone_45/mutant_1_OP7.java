class EqualsNaNBug {
    public boolean showBug(double num) {
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) { // Inserted unreachable while loop
            // This block will never be executed
        }
        return num == Double.NaN;
    }

    private boolean getCondition() {
        return false; // Always returns false
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}