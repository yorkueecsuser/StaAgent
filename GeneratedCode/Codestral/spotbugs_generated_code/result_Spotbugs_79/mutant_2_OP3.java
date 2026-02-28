class IntComparisonBug {
    public boolean showBug(int value) {
        // Unreachable if statement mutation
        if (getUnreachableCondition()) {
            System.out.println("This line should never be executed");
        }
        // Original bug remains
        return value == 2147483648L;
    }

    // Method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}