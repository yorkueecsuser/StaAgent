class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        boolean mjpfpjoa = false;while (mjpfpjoa && false && true && false && false && false && true && true && false && true && false && false) {short qlmaezse = 9219;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}