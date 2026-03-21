class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        if (true && true && true && false && true && true && false && false && true && true && false) {boolean anburtfn = false;}else{boolean bkcoamsb = true;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}