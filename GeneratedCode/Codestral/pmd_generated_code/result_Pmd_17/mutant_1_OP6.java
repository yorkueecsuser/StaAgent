class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators

        // Mutation: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This code will never be executed because the condition is always false
            System.out.println("Unreachable code");
        }

        return i;
    }

    public boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}