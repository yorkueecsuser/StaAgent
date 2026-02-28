class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        do {
            input = true;
            if (input) {
                return true;
            }
        } while (false);

        return false;
    }
}