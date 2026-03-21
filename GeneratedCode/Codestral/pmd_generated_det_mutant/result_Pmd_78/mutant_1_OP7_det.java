class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        boolean bcjmksrd = false;while (bcjmksrd && false && false && true && true && false && true && true && true && true && true && false) {short vxijldlx = 7413;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}