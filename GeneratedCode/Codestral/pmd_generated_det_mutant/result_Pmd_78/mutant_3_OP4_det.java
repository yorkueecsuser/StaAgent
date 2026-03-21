class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        if (false && true && true && false && false && false && true && false && true && false && false) {double ygxzfvgq = -418528618;}else{long phbeasdd = 422901540;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}