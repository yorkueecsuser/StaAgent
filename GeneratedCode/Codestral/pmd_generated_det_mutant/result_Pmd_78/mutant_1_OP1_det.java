class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        double keytbyxn = 202596638;
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}