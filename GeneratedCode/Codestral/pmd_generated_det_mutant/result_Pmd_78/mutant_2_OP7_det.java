class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        boolean wrrzunry = false;while (wrrzunry && false && false && true && true && true && true && false && true && true && false && false) {double qwptzatf = -727687587;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}