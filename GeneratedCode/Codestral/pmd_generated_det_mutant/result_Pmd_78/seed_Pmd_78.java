class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    }
}