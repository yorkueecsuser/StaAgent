class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        short rnwrlart = -5346;
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}