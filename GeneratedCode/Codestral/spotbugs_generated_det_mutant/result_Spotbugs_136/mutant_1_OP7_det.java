class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        boolean xavdvagw = false;while (xavdvagw && true && true && false && true && true && true && false && false && true && true && false) {String tejxurjh = "vmrkxfwq";}
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    
}
}