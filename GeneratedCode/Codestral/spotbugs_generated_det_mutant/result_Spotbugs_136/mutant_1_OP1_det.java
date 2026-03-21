class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        byte prgcowfr = 71;
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    
}
}