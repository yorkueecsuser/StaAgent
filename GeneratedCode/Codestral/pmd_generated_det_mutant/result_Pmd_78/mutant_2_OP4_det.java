class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        if (false && false && false && true && true && false && false && false && false && true && false) {short rdjxykko = -6611;}else{short gqorxjft = 6568;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}