class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        if (false && true && false && true && false && true && true && false && false && true && false) {double cskkoqyu = -77269995;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}