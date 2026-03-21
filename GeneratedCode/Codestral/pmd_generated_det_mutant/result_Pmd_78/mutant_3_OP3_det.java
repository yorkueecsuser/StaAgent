class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        if (true && false && true && true && false && false && true && true && false && false && false) {float eocjxwcv = -731532995;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}