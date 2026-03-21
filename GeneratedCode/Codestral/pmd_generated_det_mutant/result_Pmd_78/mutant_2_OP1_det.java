class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        char nvtkzipn = 'y';
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}