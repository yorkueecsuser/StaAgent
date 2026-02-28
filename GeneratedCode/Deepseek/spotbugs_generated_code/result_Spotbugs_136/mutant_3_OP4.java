class BuggyCode {

    public boolean getFalseCondition() {
        return false; // This method always returns false to make the if statement unreachable
    }

    public boolean showBug(boolean input) {
        // Original bug: QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT
        if (input = true) {
            return true;
        }
        // Mutant code: Unreachable if-else statement
        else if (getFalseCondition()) { // This branch is unreachable
            throw new RuntimeException("This code should never be executed");
        }
        return false;
    }
}