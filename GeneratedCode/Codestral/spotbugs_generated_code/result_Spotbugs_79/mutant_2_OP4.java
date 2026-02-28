class IntComparisonBug {
    // This method returns false to make the if-else branch unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(int value) {
        // Unreachable if-else branch
        if (getUnreachableCondition()) {
            System.out.println("This is an unreachable branch");
        } else {
            // Original buggy code
            return value == 2147483648L;
        }
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}