class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        if (true && false && false && true && true && false && false && false && true && true && false) {double rynblotb = -480891688;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}