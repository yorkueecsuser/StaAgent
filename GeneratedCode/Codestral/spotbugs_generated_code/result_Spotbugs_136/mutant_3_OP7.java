class BuggyCode {

    public boolean showBug(boolean input) {
        // Original bug: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }

        // Mutated code: Adding unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This is an unreachable loop");
        }

        return false;
    }
}