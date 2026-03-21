class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        boolean pgztaqfv = false;while (pgztaqfv && true && false && true && true && false && false && true && false && false && true && false) {double fitgecro = -936852827;}
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    
}
}