class BuggyCode {

    public boolean showBug(boolean input) {
        boolean continueLoop = true;
        do {
            // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            if (input = true) { // The '=' is a mistake, this should be '=='
                return true;
            }
            continueLoop = false; // Break the loop to mimic the condition
        } while (continueLoop);
        return false;
    }
}