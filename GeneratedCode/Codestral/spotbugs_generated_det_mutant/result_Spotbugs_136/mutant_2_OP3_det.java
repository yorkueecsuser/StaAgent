class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (false && true && true && true && false && true && false && false && false && true && false) {double jccpmztz = -596301797;}
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    
}
}