class MultipleUnaryOperatorsBug {
    private boolean getCondition() {
        return false;  // This method always returns false for mutation
    }

    public int showBug() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators

        // Mutant: Unreachable while loop is added here
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line should not be executed.");
        }

        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}