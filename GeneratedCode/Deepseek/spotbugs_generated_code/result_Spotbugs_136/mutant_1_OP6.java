class BuggyCode {

    public boolean getCondition() { // New method to avoid using a compile-time constant
        return false;
    }

    public boolean showBug(boolean input) {
        // Original bug: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }

        // Mutation: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // This loop is unreachable as the condition is always false
            System.out.println("This line will never be executed");
        }

        return false;
    }
}